
package com.ek.ws.interceptor.sei;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ek.ws.interceptor.sei package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMyInfo_QNAME = new QName("http://sei.interceptor.ws.ek.com/", "getMyInfo");
    private final static QName _GetMyInfoResponse_QNAME = new QName("http://sei.interceptor.ws.ek.com/", "getMyInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ek.ws.interceptor.sei
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMyInfo }
     * 
     */
    public GetMyInfo createGetMyInfo() {
        return new GetMyInfo();
    }

    /**
     * Create an instance of {@link GetMyInfoResponse }
     * 
     */
    public GetMyInfoResponse createGetMyInfoResponse() {
        return new GetMyInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.interceptor.ws.ek.com/", name = "getMyInfo")
    public JAXBElement<GetMyInfo> createGetMyInfo(GetMyInfo value) {
        return new JAXBElement<GetMyInfo>(_GetMyInfo_QNAME, GetMyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.interceptor.ws.ek.com/", name = "getMyInfoResponse")
    public JAXBElement<GetMyInfoResponse> createGetMyInfoResponse(GetMyInfoResponse value) {
        return new JAXBElement<GetMyInfoResponse>(_GetMyInfoResponse_QNAME, GetMyInfoResponse.class, null, value);
    }

}
