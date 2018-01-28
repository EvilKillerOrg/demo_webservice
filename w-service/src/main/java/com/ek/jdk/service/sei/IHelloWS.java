package com.ek.jdk.service.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 使用JDK开发WebService
 * SEI:WebService的终端接口就是WebService服务端用来处理请求的接口.接口里就是提供服务的方法
 * 
 * @ClassName: HelloWS
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月28日 上午4:35:04
 */
@WebService //声明这是一个SEI
public interface IHelloWS {

  @WebMethod //声明这是一个SEI的方法
  public String sayHello(String name);

}
