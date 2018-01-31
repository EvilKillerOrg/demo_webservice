package com.ek.ws.interceptor.logging.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 测试系统日志拦截器-接口
 * 
 * @ClassName: ILoggingInterceptor
 * @Description: TODO
 * @author: ek
 * @date: 2018年1月30日 上午2:46:24
 */

@WebService
public interface ILoggingInterceptor {
  
  @WebMethod
  public String getMyInfo(String name, int age);

}
