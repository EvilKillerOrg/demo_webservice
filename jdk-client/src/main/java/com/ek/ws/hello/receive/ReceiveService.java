package com.ek.ws.hello.receive;

import org.apache.log4j.Logger;
import com.ek.ws.hello.sei.HelloWSImpl;
import com.ek.ws.hello.sei.HelloWSImplService;

/**
 * 客户端接收
 * 
 * @ClassName: ReceiveService
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月28日 下午9:12:35
 */
public class ReceiveService {
  private static Logger log = Logger.getLogger(ReceiveService.class);

  public static void main(String[] args) {
    HelloWSImplService factory = new HelloWSImplService();
    HelloWSImpl helloWSImplPort = factory.getHelloWSImplPort();
    String result = helloWSImplPort.sayHello("mike");

    log.info("Is Client Print " + result);
  }

}
