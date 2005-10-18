/**
 * NPOServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public interface NPOServiceSoap extends java.rmi.Remote {
    public se.carelink.webservices.npo.HamtaPersonuppgifterReply hamtaPersonuppgifter(java.lang.String pnr) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.NPOMessageReply registreraSamtycke(java.lang.String patientPnr, se.carelink.webservices.npo.SamtyckeTypEnum samtyckeTyp, java.lang.String samtyckeSubTyp, se.carelink.webservices.npo.SamtyckeOperationEnum samtyckeOperation) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.HamtaSamtyckeReply hamtaSamtycke1(java.lang.String patientPnr, java.lang.String huvudman) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.HamtaSamtyckeReply hamtaVardrelation(java.lang.String patientPnr) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.HamtaVarddokumentIndexReply hamtaVarddokumentIndex(java.lang.String patientPnr) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.HamtaVarddokumentReply hamtaVarddokument(java.lang.String patientPnr, se.carelink.webservices.npo.ArrayOfVD_id vd_ids) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.GetSecurityServiceConfigReply getSecurityServiceConfig() throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.HamtaPatientLogReply hamtaPatientLog(java.lang.String patientPnr) throws java.rmi.RemoteException;
}
