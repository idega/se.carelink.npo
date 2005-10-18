/**
 * TicketRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo.security;

public class TicketRef  implements java.io.Serializable {
    private byte[] ticket_ref;

    public TicketRef() {
    }

    public TicketRef(
           byte[] ticket_ref) {
           this.ticket_ref = ticket_ref;
    }


    /**
     * Gets the ticket_ref value for this TicketRef.
     * 
     * @return ticket_ref
     */
    public byte[] getTicket_ref() {
        return ticket_ref;
    }


    /**
     * Sets the ticket_ref value for this TicketRef.
     * 
     * @param ticket_ref
     */
    public void setTicket_ref(byte[] ticket_ref) {
        this.ticket_ref = ticket_ref;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketRef)) return false;
        TicketRef other = (TicketRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticket_ref==null && other.getTicket_ref()==null) || 
             (this.ticket_ref!=null &&
              java.util.Arrays.equals(this.ticket_ref, other.getTicket_ref())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTicket_ref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTicket_ref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTicket_ref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "TicketRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_ref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "ticket_ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
