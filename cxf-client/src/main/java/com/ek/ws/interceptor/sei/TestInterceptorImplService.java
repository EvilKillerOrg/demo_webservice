package com.ek.ws.interceptor.sei;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2018-01-30T03:46:09.146+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "TestInterceptorImplService", 
                  wsdlLocation = "file:/E:/Workspace/eclipse/workspace4.5/demo_webservice/cxf-client/src/main/java/testinterceptorws.wsdl",
                  targetNamespace = "http://sei.interceptor.ws.ek.com/") 
public class TestInterceptorImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sei.interceptor.ws.ek.com/", "TestInterceptorImplService");
    public final static QName TestInterceptorImplPort = new QName("http://sei.interceptor.ws.ek.com/", "TestInterceptorImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/Workspace/eclipse/workspace4.5/demo_webservice/cxf-client/src/main/java/testinterceptorws.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TestInterceptorImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/Workspace/eclipse/workspace4.5/demo_webservice/cxf-client/src/main/java/testinterceptorws.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TestInterceptorImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TestInterceptorImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestInterceptorImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public TestInterceptorImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TestInterceptorImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TestInterceptorImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ITestInterceptor
     */
    @WebEndpoint(name = "TestInterceptorImplPort")
    public ITestInterceptor getTestInterceptorImplPort() {
        return super.getPort(TestInterceptorImplPort, ITestInterceptor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ITestInterceptor
     */
    @WebEndpoint(name = "TestInterceptorImplPort")
    public ITestInterceptor getTestInterceptorImplPort(WebServiceFeature... features) {
        return super.getPort(TestInterceptorImplPort, ITestInterceptor.class, features);
    }

}
