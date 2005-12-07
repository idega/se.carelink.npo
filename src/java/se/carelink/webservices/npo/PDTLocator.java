/**
 * PDTLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class PDTLocator extends org.apache.axis.client.Service implements se.carelink.webservices.npo.PDT {

    public PDTLocator() {
    }


    public PDTLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PDTLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PDTSoap
    private java.lang.String PDTSoap_address = "http://195.22.83.100:8888/axis/services/PDTSoap";

    public java.lang.String getPDTSoapAddress() {
        return PDTSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PDTSoapWSDDServiceName = "PDTSoap";

    public java.lang.String getPDTSoapWSDDServiceName() {
        return PDTSoapWSDDServiceName;
    }

    public void setPDTSoapWSDDServiceName(java.lang.String name) {
        PDTSoapWSDDServiceName = name;
    }

    public se.carelink.webservices.npo.PDTSoap getPDTSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PDTSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPDTSoap(endpoint);
    }

    public se.carelink.webservices.npo.PDTSoap getPDTSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            se.carelink.webservices.npo.PDTSoapSoapBindingStub _stub = new se.carelink.webservices.npo.PDTSoapSoapBindingStub(portAddress, this);
            _stub.setPortName(getPDTSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPDTSoapEndpointAddress(java.lang.String address) {
        PDTSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (se.carelink.webservices.npo.PDTSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                se.carelink.webservices.npo.PDTSoapSoapBindingStub _stub = new se.carelink.webservices.npo.PDTSoapSoapBindingStub(new java.net.URL(PDTSoap_address), this);
                _stub.setPortName(getPDTSoapWSDDServiceName());
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
        if ("PDTSoap".equals(inputPortName)) {
            return getPDTSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "PDT");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "PDTSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PDTSoap".equals(portName)) {
            setPDTSoapEndpointAddress(address);
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
