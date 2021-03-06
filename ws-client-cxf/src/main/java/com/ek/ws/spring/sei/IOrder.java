package com.ek.ws.spring.sei;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2018-02-01T03:06:37.191+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebService(targetNamespace = "http://sei.spring.ws.ek.com/", name = "IOrder")
@XmlSeeAlso({ObjectFactory.class})
public interface IOrder {

    @WebMethod
    @RequestWrapper(localName = "getOrderById", targetNamespace = "http://sei.spring.ws.ek.com/", className = "com.ek.ws.spring.sei.GetOrderById")
    @ResponseWrapper(localName = "getOrderByIdResponse", targetNamespace = "http://sei.spring.ws.ek.com/", className = "com.ek.ws.spring.sei.GetOrderByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.ek.ws.spring.sei.Order getOrderById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}
