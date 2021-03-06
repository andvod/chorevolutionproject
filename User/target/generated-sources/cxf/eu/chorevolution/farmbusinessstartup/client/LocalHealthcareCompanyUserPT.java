package eu.chorevolution.farmbusinessstartup.client;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-22T13:15:58.395+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://eu.chorevolution.farmbusinessstartup/cduser", name = "LocalHealthcareCompanyUserPT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LocalHealthcareCompanyUserPT {

    @WebMethod
    @Oneway
    public void farmBusinessCodeAssignment(
        @WebParam(partName = "parameters", name = "farmBusinessStartupResponseElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/cduser")
        FarmBusinessStartupResponseType parameters
    );
}
