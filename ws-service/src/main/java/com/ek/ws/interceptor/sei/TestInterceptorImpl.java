package com.ek.ws.interceptor.sei;

import javax.jws.WebService;

/**
 * 测试系统日志拦截器-接口实现
 * 
 * @ClassName: LoggingInterceptorImpl
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月30日 上午2:46:47
 */
@WebService
public class TestInterceptorImpl implements ITestInterceptor {

  @Override
  public String getMyInfo(String name, int age) {

    return "you are " + name + " ("+age+")!!!";
  }

}
