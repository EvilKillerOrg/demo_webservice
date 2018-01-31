package com.ek.ws.spring.sei;

import javax.jws.WebService;

import com.ek.ws.spring.Order;

@WebService
public class OrderImpl implements IOrder {

  @Override
  public Order getOrderById(int id) {
    return new Order(id, "大炮", 250);
  }

}
