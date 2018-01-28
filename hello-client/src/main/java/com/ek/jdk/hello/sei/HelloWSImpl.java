
package com.ek.jdk.hello.sei;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWSImpl", targetNamespace = "http://sei.hello.jdk.ek.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWSImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://sei.hello.jdk.ek.com/", className = "com.ek.jdk.hello.sei.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://sei.hello.jdk.ek.com/", className = "com.ek.jdk.hello.sei.SayHelloResponse")
    @Action(input = "http://sei.hello.jdk.ek.com/HelloWSImpl/sayHelloRequest", output = "http://sei.hello.jdk.ek.com/HelloWSImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}