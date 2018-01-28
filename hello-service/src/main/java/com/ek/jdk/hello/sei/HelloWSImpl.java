package com.ek.jdk.hello.sei;

import javax.jws.WebService;
import org.apache.log4j.Logger;

/**
 * 这是SEI的实现
 * 
 * @ClassName: HelloWSImpl
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月28日 上午4:40:12
 */

@WebService // SEI的实现类也要给一个@WebService注解,方法不用加注解了
public class HelloWSImpl implements IHelloWS {

  private Logger log = Logger.getLogger(HelloWSImpl.class);

  @Override
  public String sayHello(String name) {
    log.info("Is Service Endpoint Interface Print " + name);

    return "Hello " + name;
  }

}
