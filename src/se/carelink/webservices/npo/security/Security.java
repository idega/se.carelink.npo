/**
 * Security.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo.security;

public interface Security extends javax.xml.rpc.Service {
    public java.lang.String getSecuritySoapAddress();

    public se.carelink.webservices.npo.security.SecuritySoap getSecuritySoap() throws javax.xml.rpc.ServiceException;

    public se.carelink.webservices.npo.security.SecuritySoap getSecuritySoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
