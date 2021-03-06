
package com.profact;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimbradoSoap", targetNamespace = "http://localhost/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TimbradoSoap {


    /**
     * Servicio de registro para emisores
     * 
     * @param usuarioIntegrador
     * @param contrasena
     * @param base64Key
     * @param base64Cer
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "RegistraEmisor", action = "http://localhost/RegistraEmisor")
    @WebResult(name = "RegistraEmisorResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "RegistraEmisor", targetNamespace = "http://localhost/", className = "com.profact.RegistraEmisor")
    @ResponseWrapper(localName = "RegistraEmisorResponse", targetNamespace = "http://localhost/", className = "com.profact.RegistraEmisorResponse")
    public ArrayOfAnyType registraEmisor(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor,
        @WebParam(name = "base64Cer", targetNamespace = "http://localhost/")
        String base64Cer,
        @WebParam(name = "base64Key", targetNamespace = "http://localhost/")
        String base64Key,
        @WebParam(name = "contrasena", targetNamespace = "http://localhost/")
        String contrasena);

    /**
     * Servicio de timbrado de retenciones y pagos
     * 
     * @param usuarioIntegrador
     * @param xmlComprobanteBase64
     * @param idComprobante
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "TimbraRetencion", action = "http://localhost/TimbraRetencion")
    @WebResult(name = "TimbraRetencionResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "TimbraRetencion", targetNamespace = "http://localhost/", className = "com.profact.TimbraRetencion")
    @ResponseWrapper(localName = "TimbraRetencionResponse", targetNamespace = "http://localhost/", className = "com.profact.TimbraRetencionResponse")
    public ArrayOfAnyType timbraRetencion(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "xmlComprobanteBase64", targetNamespace = "http://localhost/")
        String xmlComprobanteBase64,
        @WebParam(name = "idComprobante", targetNamespace = "http://localhost/")
        String idComprobante);

    /**
     * Servicio de asignación de timbres para Integradores
     * 
     * @param usuarioIntegrador
     * @param noTimbres
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "AsignaTimbresEmisor", action = "http://localhost/AsignaTimbresEmisor")
    @WebResult(name = "AsignaTimbresEmisorResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "AsignaTimbresEmisor", targetNamespace = "http://localhost/", className = "com.profact.AsignaTimbresEmisor")
    @ResponseWrapper(localName = "AsignaTimbresEmisorResponse", targetNamespace = "http://localhost/", className = "com.profact.AsignaTimbresEmisorResponse")
    public ArrayOfAnyType asignaTimbresEmisor(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor,
        @WebParam(name = "noTimbres", targetNamespace = "http://localhost/")
        int noTimbres);

    /**
     * Servicio de consulta de timbres para Integradores
     * 
     * @param usuarioIntegrador
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "ObtieneTimbresDisponibles", action = "http://localhost/ObtieneTimbresDisponibles")
    @WebResult(name = "ObtieneTimbresDisponiblesResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "ObtieneTimbresDisponibles", targetNamespace = "http://localhost/", className = "com.profact.ObtieneTimbresDisponibles")
    @ResponseWrapper(localName = "ObtieneTimbresDisponiblesResponse", targetNamespace = "http://localhost/", className = "com.profact.ObtieneTimbresDisponiblesResponse")
    public ArrayOfAnyType obtieneTimbresDisponibles(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor);

    /**
     * Servicio de timbrado para Integradores
     * 
     * @param usuarioIntegrador
     * @param xmlComprobanteBase64
     * @param idComprobante
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "TimbraCFDI", action = "http://localhost/TimbraCFDI")
    @WebResult(name = "TimbraCFDIResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "TimbraCFDI", targetNamespace = "http://localhost/", className = "com.profact.TimbraCFDI")
    @ResponseWrapper(localName = "TimbraCFDIResponse", targetNamespace = "http://localhost/", className = "com.profact.TimbraCFDIResponse")
    public ArrayOfAnyType timbraCFDI(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "xmlComprobanteBase64", targetNamespace = "http://localhost/")
        String xmlComprobanteBase64,
        @WebParam(name = "idComprobante", targetNamespace = "http://localhost/")
        String idComprobante);

    /**
     * Servicio de cancelación CFDI
     * 
     * @param usuarioIntegrador
     * @param folioUUID
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "CancelaCFDI", action = "http://localhost/CancelaCFDI")
    @WebResult(name = "CancelaCFDIResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "CancelaCFDI", targetNamespace = "http://localhost/", className = "com.profact.CancelaCFDI")
    @ResponseWrapper(localName = "CancelaCFDIResponse", targetNamespace = "http://localhost/", className = "com.profact.CancelaCFDIResponse")
    public ArrayOfAnyType cancelaCFDI(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://localhost/")
        String folioUUID);

    /**
     * Servicio de cancelación CFDI con acuse
     * 
     * @param usuarioIntegrador
     * @param folioUUID
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "CancelaCFDIAck", action = "http://localhost/CancelaCFDIAck")
    @WebResult(name = "CancelaCFDIAckResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "CancelaCFDIAck", targetNamespace = "http://localhost/", className = "com.profact.CancelaCFDIAck")
    @ResponseWrapper(localName = "CancelaCFDIAckResponse", targetNamespace = "http://localhost/", className = "com.profact.CancelaCFDIAckResponse")
    public ArrayOfAnyType cancelaCFDIAck(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://localhost/")
        String folioUUID);

    /**
     * Servicio de cancelación de retenciones y pagos
     * 
     * @param usuarioIntegrador
     * @param folioUUID
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "CancelaRetencion", action = "http://localhost/CancelaRetencion")
    @WebResult(name = "CancelaRetencionResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "CancelaRetencion", targetNamespace = "http://localhost/", className = "com.profact.CancelaRetencion")
    @ResponseWrapper(localName = "CancelaRetencionResponse", targetNamespace = "http://localhost/", className = "com.profact.CancelaRetencionResponse")
    public ArrayOfAnyType cancelaRetencion(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://localhost/")
        String folioUUID);

    /**
     * Servicio de consulta CFDI
     * 
     * @param usuarioIntegrador
     * @param folioUUID
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "ObtieneCFDI", action = "http://localhost/ObtieneCFDI")
    @WebResult(name = "ObtieneCFDIResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "ObtieneCFDI", targetNamespace = "http://localhost/", className = "com.profact.ObtieneCFDI")
    @ResponseWrapper(localName = "ObtieneCFDIResponse", targetNamespace = "http://localhost/", className = "com.profact.ObtieneCFDIResponse")
    public ArrayOfAnyType obtieneCFDI(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://localhost/")
        String folioUUID);

    /**
     * Servicio de consulta retenciones y pagos
     * 
     * @param usuarioIntegrador
     * @param folioUUID
     * @param rfcEmisor
     * @return
     *     returns com.profact.ArrayOfAnyType
     */
    @WebMethod(operationName = "ObtieneRetencion", action = "http://localhost/ObtieneRetencion")
    @WebResult(name = "ObtieneRetencionResult", targetNamespace = "http://localhost/")
    @RequestWrapper(localName = "ObtieneRetencion", targetNamespace = "http://localhost/", className = "com.profact.ObtieneRetencion")
    @ResponseWrapper(localName = "ObtieneRetencionResponse", targetNamespace = "http://localhost/", className = "com.profact.ObtieneRetencionResponse")
    public ArrayOfAnyType obtieneRetencion(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://localhost/")
        String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://localhost/")
        String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://localhost/")
        String folioUUID);

}
