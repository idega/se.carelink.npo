/**
 * NPOMessageHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class NPOMessageHeader  implements java.io.Serializable {
    private String ticket;
    private String context;

    public NPOMessageHeader() {
    }

    public NPOMessageHeader(
    		String ticket,
    		String context) {
           this.ticket = ticket;
           this.context = context;
    }


    /**
     * Gets the ticket value for this NPOMessageHeader.
     * 
     * @return ticket
     */
    public String getTicket() {
        return ticket;
    }


    /**
     * Sets the ticket value for this NPOMessageHeader.
     * 
     * @param ticket
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }


    /**
     * Gets the context value for this NPOMessageHeader.
     * 
     * @return context
     */
    public String getContext() {
        return context;
    }


    /**
     * Sets the context value for this NPOMessageHeader.
     * 
     * @param context
     */
    public void setContext(String context) {
        this.context = context;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NPOMessageHeader)) return false;
        NPOMessageHeader other = (NPOMessageHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticket==null && other.getTicket()==null) || 
             (this.ticket!=null &&
             		this.ticket.equalsIgnoreCase(other.getTicket()))) &&
            ((this.context==null && other.getContext()==null) || 
             (this.context!=null &&
              this.context.equalsIgnoreCase(other.getContext())));
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
        if (getTicket() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTicket());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTicket(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContext(), i);
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
        new org.apache.axis.description.TypeDesc(NPOMessageHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "NPOMessageHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("context");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "context"));
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
