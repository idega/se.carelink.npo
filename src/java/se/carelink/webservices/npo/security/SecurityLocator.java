/**
 * SecurityLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo.security;

public class SecurityLocator extends org.apache.axis.client.Service implements se.carelink.webservices.npo.security.Security {

    public SecurityLocator() {
    }


    public SecurityLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SecurityLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SecuritySoap
    private java.lang.String SecuritySoap_address = "http://testdb.idega.is:8090/NPOclustersim050616/security.asmx";

    public java.lang.String getSecuritySoapAddress() {
        return SecuritySoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SecuritySoapWSDDServiceName = "SecuritySoap";

    public java.lang.String getSecuritySoapWSDDServiceName() {
        return SecuritySoapWSDDServiceName;
    }

    public void setSecuritySoapWSDDServiceName(java.lang.String name) {
        SecuritySoapWSDDServiceName = name;
    }

    public se.carelink.webservices.npo.security.SecuritySoap getSecuritySoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SecuritySoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSecuritySoap(endpoint);
    }

    public se.carelink.webservices.npo.security.SecuritySoap getSecuritySoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            se.carelink.webservices.npo.security.SecuritySoapStub _stub = new se.carelink.webservices.npo.security.SecuritySoapStub(portAddress, this);
            _stub.setPortName(getSecuritySoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSecuritySoapEndpointAddress(java.lang.String address) {
        SecuritySoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (se.carelink.webservices.npo.security.SecuritySoap.class.isAssignableFrom(serviceEndpointInterface)) {
                se.carelink.webservices.npo.security.SecuritySoapStub _stub = new se.carelink.webservices.npo.security.SecuritySoapStub(new java.net.URL(SecuritySoap_address), this);
                _stub.setPortName(getSecuritySoapWSDDServiceName());
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
        if ("SecuritySoap".equals(inputPortName)) {
            return getSecuritySoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "Security");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "SecuritySoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SecuritySoap".equals(portName)) {
            setSecuritySoapEndpointAddress(address);
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
