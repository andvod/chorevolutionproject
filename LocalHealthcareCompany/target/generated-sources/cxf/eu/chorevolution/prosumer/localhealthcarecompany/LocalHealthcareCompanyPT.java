package eu.chorevolution.prosumer.localhealthcarecompany;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-05-30T15:27:08.076+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany", name = "LocalHealthcareCompanyPT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LocalHealthcareCompanyPT {

    @WebMethod
    @WebResult(name = "sendFarmSiteInspectionRequestElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany", partName = "parameters")
    public FarmSiteInspectionRequestReturnType sendFarmSiteInspectionRequest(
        @WebParam(partName = "parameters", name = "sendFarmSiteInspectionRequestElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "farmBusinessStartupRequestElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany", partName = "parameters")
    public FarmBusinessStartupRequestReturnType farmBusinessCodeRequest(
        @WebParam(partName = "parameters", name = "farmBusinessStartupRequestElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany")
        FarmBusinessStartupRequestType parameters
    );

    @WebMethod
    @WebResult(name = "farmSiteInspectionResponseElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany", partName = "parameters")
    public FarmSiteInspectionResponseReturnType farmSiteInspectionVerbal(
        @WebParam(partName = "parameters", name = "farmSiteInspectionResponseElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany")
        FarmSiteInspectionResponseType parameters
    );

    @WebMethod
    @WebResult(name = "sendFarmBusinessStartupResponseElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany", partName = "parameters")
    public FarmBusinessStartupResponseReturnType sendFarmBusinessStartupResponse(
        @WebParam(partName = "parameters", name = "sendFarmBusinessStartupResponseElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "sendFarmOpeningNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany", partName = "parameters")
    public FarmOpeningNotificationReturnType sendFarmOpeningNotification(
        @WebParam(partName = "parameters", name = "sendFarmOpeningNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "farmRegistrationNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany", partName = "parameters")
    public FarmRegistrationNotificationReturnType farmBusinessStartupNotification(
        @WebParam(partName = "parameters", name = "farmRegistrationNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany")
        FarmRegistrationNotificationType parameters
    );
}
