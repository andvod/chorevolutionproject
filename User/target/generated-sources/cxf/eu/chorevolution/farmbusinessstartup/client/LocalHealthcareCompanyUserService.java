package eu.chorevolution.farmbusinessstartup.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-22T13:15:58.534+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "LocalHealthcareCompanyUserService", 
                  wsdlLocation = "classpath:cdUser.wsdl",
                  targetNamespace = "http://eu.chorevolution.farmbusinessstartup/cduser") 
public class LocalHealthcareCompanyUserService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://eu.chorevolution.farmbusinessstartup/cduser", "LocalHealthcareCompanyUserService");
    public final static QName LocalHealthcareCompanyUserPort = new QName("http://eu.chorevolution.farmbusinessstartup/cduser", "LocalHealthcareCompanyUserPort");
    static {
        URL url = LocalHealthcareCompanyUserService.class.getClassLoader().getResource("cdUser.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(LocalHealthcareCompanyUserService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:cdUser.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public LocalHealthcareCompanyUserService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LocalHealthcareCompanyUserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocalHealthcareCompanyUserService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public LocalHealthcareCompanyUserService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LocalHealthcareCompanyUserService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LocalHealthcareCompanyUserService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns LocalHealthcareCompanyUserPT
     */
    @WebEndpoint(name = "LocalHealthcareCompanyUserPort")
    public LocalHealthcareCompanyUserPT getLocalHealthcareCompanyUserPort() {
        return super.getPort(LocalHealthcareCompanyUserPort, LocalHealthcareCompanyUserPT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocalHealthcareCompanyUserPT
     */
    @WebEndpoint(name = "LocalHealthcareCompanyUserPort")
    public LocalHealthcareCompanyUserPT getLocalHealthcareCompanyUserPort(WebServiceFeature... features) {
        return super.getPort(LocalHealthcareCompanyUserPort, LocalHealthcareCompanyUserPT.class, features);
    }

}
