package com.ek.ws.hello.publish;

import javax.xml.ws.Endpoint;

import org.apache.log4j.Logger;

import com.ek.ws.hello.sei.HelloWSImpl;

/**
 * 发布 WebService 服务
 * JDK实现用JDK的工具就行了,其他不变
 * CXF实现用CXF的工具就行了,其他不变
 * 
 * @ClassName: PublishService
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月28日 上午6:37:01
 */
public class PublishService {

  private static Logger log = Logger.getLogger(PublishService.class);

  /* 要访问发布的wsdl只需要在用浏览器打开发布地址后面加上?wsdl就可以了 */
  public static void main(String[] args) {
    String address = "http://localhost:8088/demo_webservice/hellows";
    Endpoint.publish(address, new HelloWSImpl()); // 这要传SEI的实现类
    log.info("发布WebService成功了..!");
  }

}
