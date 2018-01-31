package com.ek.ws.spring.receive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ek.ws.spring.sei.IOrder;
import com.ek.ws.spring.sei.Order;

public class ReceiveService {
  
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-client-cxf.xml");
    IOrder order = (IOrder) context.getBean("orderws");
    Order o = order.getOrderById(22);
    System.out.println(o);
  }

}
