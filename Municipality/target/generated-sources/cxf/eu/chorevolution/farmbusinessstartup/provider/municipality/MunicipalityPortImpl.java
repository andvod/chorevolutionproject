
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.chorevolution.farmbusinessstartup.provider.municipality;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-22T13:25:42.832+02:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "MunicipalityService",
                      portName = "MunicipalityPort",
                      targetNamespace = "http://eu.chorevolution.farmbusinessstartup/services/municipality",
                      wsdlLocation = "classpath:Municipality.wsdl",
                      endpointInterface = "eu.chorevolution.farmbusinessstartup.provider.municipality.MunicipalityPT")
                      
public class MunicipalityPortImpl implements MunicipalityPT {

    private static final Logger LOG = Logger.getLogger(MunicipalityPortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.municipality.MunicipalityPT#farmBusinessCodeStartupNotification(eu.chorevolution.farmbusinessstartup.provider.municipality.FarmBusinessCodeStartupNotification  parameters )*
     */
    public void farmBusinessCodeStartupNotification(FarmBusinessCodeStartupNotification parameters) { 
        LOG.info("Executing operation farmBusinessCodeStartupNotification");
        System.out.println(parameters);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
