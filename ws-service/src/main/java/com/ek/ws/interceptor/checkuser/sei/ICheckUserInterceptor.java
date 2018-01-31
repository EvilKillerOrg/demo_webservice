package com.ek.ws.interceptor.checkuser.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ek.ws.interceptor.checkuser.UserBean;

@WebService
public interface ICheckUserInterceptor {

  @WebMethod
  public String checkUser(UserBean userBean);

}
