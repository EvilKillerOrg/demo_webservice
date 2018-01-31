package com.ek.ws.interceptor.checkuser.publish;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

import com.ek.ws.interceptor.checkuser.CheckUserInterceptor;
import com.ek.ws.interceptor.checkuser.sei.CheckUserInterceptorImpl;

public class PublishService {
  
  private static Logger log = Logger.getLogger(PublishService.class);
  
  public static void main(String[] args) {
    String address = "http://localhost:8088/demo_webservice/checkUserInterceptor";
    Endpoint endpoint = Endpoint.publish(address, new CheckUserInterceptorImpl());
    
    EndpointImpl endpointImpl = (EndpointImpl)endpoint;
    
    List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();
    inInterceptors.add(new CheckUserInterceptor());
    
    log.info("发布成功...!");
  }

}
