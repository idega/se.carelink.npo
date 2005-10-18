/**
 * NPOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class NPOServiceLocator extends org.apache.axis.client.Service implements se.carelink.webservices.npo.NPOService {

    public NPOServiceLocator() {
    }


    public NPOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NPOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NPOServiceSoap
    private java.lang.String NPOServiceSoap_address = "http://ag_file:8090/nposervice/NpoService.asmx";

    public java.lang.String getNPOServiceSoapAddress() {
        return NPOServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NPOServiceSoapWSDDServiceName = "NPOServiceSoap";

    public java.lang.String getNPOServiceSoapWSDDServiceName() {
        return NPOServiceSoapWSDDServiceName;
    }

    public void setNPOServiceSoapWSDDServiceName(java.lang.String name) {
        NPOServiceSoapWSDDServiceName = name;
    }

    public se.carelink.webservices.npo.NPOServiceSoap getNPOServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NPOServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNPOServiceSoap(endpoint);
    }

    public se.carelink.webservices.npo.NPOServiceSoap getNPOServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            se.carelink.webservices.npo.NPOServiceSoapStub _stub = new se.carelink.webservices.npo.NPOServiceSoapStub(portAddress, this);
            _stub.setPortName(getNPOServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNPOServiceSoapEndpointAddress(java.lang.String address) {
        NPOServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (se.carelink.webservices.npo.NPOServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                se.carelink.webservices.npo.NPOServiceSoapStub _stub = new se.carelink.webservices.npo.NPOServiceSoapStub(new java.net.URL(NPOServiceSoap_address), this);
                _stub.setPortName(getNPOServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NPOServiceSoap".equals(inputPortName)) {
            return getNPOServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "NPOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "NPOServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NPOServiceSoap".equals(portName)) {
            setNPOServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
