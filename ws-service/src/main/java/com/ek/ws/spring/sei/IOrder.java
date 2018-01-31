package com.ek.ws.spring.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ek.ws.spring.Order;

@WebService
public interface IOrder {
  @WebMethod
  public Order getOrderById(int id);

}
