package com.ek.ws.interceptor.logging.sei;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2018-02-01T02:16:46.433+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "LoggingInterceptorImplService", 
                  wsdlLocation = "file:/E:/Workspace/eclipse/workspace4.5/demo_webservice/ws-client-cxf/src/main/java/loggingInterceptorws.wsdl",
                  targetNamespace = "http://sei.logging.interceptor.ws.ek.com/") 
public class LoggingInterceptorImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sei.logging.interceptor.ws.ek.com/", "LoggingInterceptorImplService");
    public final static QName LoggingInterceptorImplPort = new QName("http://sei.logging.interceptor.ws.ek.com/", "LoggingInterceptorImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/Workspace/eclipse/workspace4.5/demo_webservice/ws-client-cxf/src/main/java/loggingInterceptorws.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoggingInterceptorImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/Workspace/eclipse/workspace4.5/demo_webservice/ws-client-cxf/src/main/java/loggingInterceptorws.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LoggingInterceptorImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoggingInterceptorImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoggingInterceptorImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public LoggingInterceptorImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LoggingInterceptorImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LoggingInterceptorImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ILoggingInterceptor
     */
    @WebEndpoint(name = "LoggingInterceptorImplPort")
    public ILoggingInterceptor getLoggingInterceptorImplPort() {
        return super.getPort(LoggingInterceptorImplPort, ILoggingInterceptor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ILoggingInterceptor
     */
    @WebEndpoint(name = "LoggingInterceptorImplPort")
    public ILoggingInterceptor getLoggingInterceptorImplPort(WebServiceFeature... features) {
        return super.getPort(LoggingInterceptorImplPort, ILoggingInterceptor.class, features);
    }

}
