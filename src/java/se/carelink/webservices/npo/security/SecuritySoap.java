/**
 * SecuritySoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo.security;

public interface SecuritySoap extends java.rmi.Remote {
    public se.carelink.webservices.npo.security.ValidateTicketRefReply validateTicketRef(byte[] ticketRef) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.security.ValidateTicketReply validateTicket(byte[] signedTicket) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.security.GetTicketByRefReply getTicketByRef(String ticketRef) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.security.IssueTicketRefReply issueTicketRef(se.carelink.webservices.npo.security.TicketParameters parameters) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.security.IssueTicketReply issueTicket(se.carelink.webservices.npo.security.TicketParameters parameters) throws java.rmi.RemoteException;
}
