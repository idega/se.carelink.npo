/**
 * ValidateTicketRefReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo.security;

public class ValidateTicketRefReply  extends se.carelink.webservices.npo.security.ValidateTicketReply  implements java.io.Serializable {
    private se.carelink.webservices.npo.security.SignedTicket signed_ticket;

    public ValidateTicketRefReply() {
    }

    public ValidateTicketRefReply(
           se.carelink.webservices.npo.security.SignedTicket signed_ticket) {
           this.signed_ticket = signed_ticket;
    }


    /**
     * Gets the signed_ticket value for this ValidateTicketRefReply.
     * 
     * @return signed_ticket
     */
    public se.carelink.webservices.npo.security.SignedTicket getSigned_ticket() {
        return signed_ticket;
    }


    /**
     * Sets the signed_ticket value for this ValidateTicketRefReply.
     * 
     * @param signed_ticket
     */
    public void setSigned_ticket(se.carelink.webservices.npo.security.SignedTicket signed_ticket) {
        this.signed_ticket = signed_ticket;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateTicketRefReply)) return false;
        ValidateTicketRefReply other = (ValidateTicketRefReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.signed_ticket==null && other.getSigned_ticket()==null) || 
             (this.signed_ticket!=null &&
              this.signed_ticket.equals(other.getSigned_ticket())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSigned_ticket() != null) {
            _hashCode += getSigned_ticket().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateTicketRefReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "ValidateTicketRefReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signed_ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "signed_ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "SignedTicket"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
