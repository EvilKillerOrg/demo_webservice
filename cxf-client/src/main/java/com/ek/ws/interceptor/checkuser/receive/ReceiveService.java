package com.ek.ws.interceptor.checkuser.receive;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;

import com.ek.ws.interceptor.checkuser.CheckUserInterceptor;
import com.ek.ws.interceptor.checkuser.sei.CheckUserInterceptorImplService;
import com.ek.ws.interceptor.checkuser.sei.ICheckUserInterceptor;
import com.ek.ws.interceptor.checkuser.sei.UserBean;

public class ReceiveService {

  public static void main(String[] args) {
    
    UserBean userBean = new UserBean();
    userBean.setUsername("homer");
    userBean.setPassword("111");
    
    CheckUserInterceptorImplService factory = new CheckUserInterceptorImplService();
    ICheckUserInterceptor checkUserInterceptorImpl = factory.getCheckUserInterceptorImplPort();
    
    Client client = ClientProxy.getClient(checkUserInterceptorImpl);
    List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
    outInterceptors.add(new CheckUserInterceptor(userBean.getUsername(), userBean.getPassword()));
    
    String result = checkUserInterceptorImpl.checkUser(userBean);
    System.out.println(result);
    
  }

}
