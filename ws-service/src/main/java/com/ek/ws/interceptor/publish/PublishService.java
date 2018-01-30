package com.ek.ws.interceptor.publish;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

import com.ek.ws.interceptor.sei.TestInterceptorImpl;

/**
 * 服务器端,测试拦截器
 * 
 * @ClassName: PublishService
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月30日 上午2:48:25
 */
public class PublishService {
  private static Logger log = Logger.getLogger(PublishService.class);

  public static void main(String[] args) {

    String address = "http://localhost:8088/demo_webservice/testInterceptor";
    Endpoint endpoint = Endpoint.publish(address, new TestInterceptorImpl());

    // EndpointImpl接收请求的服务端对象(Endpoint中方法有限,强转为EndpointImpl,这里有拦截器的方法)
    // org.apache.cxf.jaxws22.EndpointImpl; 这个已经@Deprecated了,新的建议可以看源码
    EndpointImpl endpointImpl = (EndpointImpl) endpoint;

    // 服务器端日志入拦截器
    List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();// 返回入拦截器集合
    inInterceptors.add(new LoggingInInterceptor());// 给入拦截器集合里加一个日志入拦截器

    // 服务器端日志出拦截器
    List<Interceptor<? extends Message>> outInterceptors = endpointImpl.getOutInterceptors();// 返回出拦截器集合
    outInterceptors.add(new LoggingOutInterceptor());// 给出拦截器集合里加一个日志入拦截器

    log.info("发布WebService成功了..携带系统日志连接器..!");
  }
}
