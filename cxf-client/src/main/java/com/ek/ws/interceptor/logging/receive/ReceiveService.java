package com.ek.ws.interceptor.logging.receive;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

import com.ek.ws.interceptor.logging.sei.ILoggingInterceptor;
import com.ek.ws.interceptor.logging.sei.LoggingInterceptorImplService;

/**
 * 客户器端,测试拦截器
 *  
 * @ClassName: ReceiveService
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月30日 上午4:04:58
 */
public class ReceiveService {

  private static Logger log = Logger.getLogger(ReceiveService.class);

  public static void main(String[] args) {

    LoggingInterceptorImplService factory = new LoggingInterceptorImplService();
    ILoggingInterceptor testInterceptorImplPort = factory.getLoggingInterceptorImplPort();

    // Client发送请求的客户端对象
    Client client = ClientProxy.getClient(testInterceptorImplPort);

    // 客户端日志出拦截器
    List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();// 返回出拦截器集合
    outInterceptors.add(new LoggingOutInterceptor());// 给出拦截器集合里加一个日志入拦截器

    // 客户端日志入拦截器
    List<Interceptor<? extends Message>> inInterceptors = client.getInInterceptors();// 返回入拦截器集合
    inInterceptors.add(new LoggingInInterceptor());// 给入拦截器集合里加一个日志入拦截器

    String myInfo = testInterceptorImplPort.getMyInfo("ek", 19);
    log.info(myInfo);

  }

}
