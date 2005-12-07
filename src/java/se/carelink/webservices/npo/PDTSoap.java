/**
 * PDTSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public interface PDTSoap extends java.rmi.Remote {
    public se.carelink.webservices.npo.HamtaPersonuppgifterReply hamtaPersonuppgifter(java.lang.String pnr) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.HamtaVarddokumentIndexReply hamtaVarddokumentIndex(java.lang.String patientPnr) throws java.rmi.RemoteException;
    public se.carelink.webservices.npo.HamtaVarddokumentReply hamtaVarddokument(se.carelink.webservices.npo.VD_id[] vd_ids) throws java.rmi.RemoteException;
}
