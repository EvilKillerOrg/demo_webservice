package com.ek.jdk.service.receive;

import org.apache.log4j.Logger;

import com.ek.jdk.service.sei.impl.HelloWSImpl;
import com.ek.jdk.service.sei.impl.HelloWSImplService;

public class ReceiveService {
  private static Logger log = Logger.getLogger(ReceiveService.class);
  
  public static void main(String[] args) {
    HelloWSImplService factory = new HelloWSImplService();
    HelloWSImpl helloWSImplPort = factory.getHelloWSImplPort();
    String result = helloWSImplPort.sayHello("mike");
    
    log.info("Is Client Print "+result);
  }

}
