package com.ek.ws.interceptor.checkuser;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

public class CheckUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

 

  public CheckUserInterceptor() {
    super(Phase.PRE_PROTOCOL);
  }
 
  @Override
  public void handleMessage(SoapMessage msg) throws Fault {
   Header header = msg.getHeader(new QName("ekstudio"));
   if(header!=null){
     Element element = (Element)header.getObject();
     String name = element.getElementsByTagName("name").item(0).getTextContent();
     String password = element.getElementsByTagName("password").item(0).getTextContent();
     if(name.equals("homer") && password.equals("111")){
       System.out.println("通过拦截器...!");
       return;
     }
   }
   System.out.println("没有通过...!");
   throw new Fault(new IllegalArgumentException("不能通过,记得要抛异常"));

  }

}
