package com.ek.ws.hello.receive;

import org.apache.log4j.Logger;
import com.ek.ws.hello.sei.HelloWSImplService;
import com.ek.ws.hello.sei.IHelloWS;

/**
 * 客户端接收
 * 
 * @ClassName: ReceiveService
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月29日 下午5:13:49
 */
public class ReceiveService {
  private static Logger log = Logger.getLogger(ReceiveService.class);

  public static void main(String[] args) {
    HelloWSImplService helloWSImplService = new HelloWSImplService();
    IHelloWS helloWSImplPort = helloWSImplService.getHelloWSImplPort();
    String result = helloWSImplPort.sayHello("homer");
    log.info("Is Client Print " + result);
  }

}
