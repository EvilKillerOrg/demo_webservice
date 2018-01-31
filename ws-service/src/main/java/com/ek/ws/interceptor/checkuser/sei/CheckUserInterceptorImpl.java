package com.ek.ws.interceptor.checkuser.sei;

import javax.jws.WebService;

import com.ek.ws.interceptor.checkuser.UserBean;

@WebService
public class CheckUserInterceptorImpl implements ICheckUserInterceptor {

  @Override
  public String checkUser(UserBean userBean) {

    return userBean.toString();
  }

}
