/**
 * NPOSecurityMessageReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo.security;

public class NPOSecurityMessageReply  implements java.io.Serializable {
    private se.carelink.webservices.npo.security.ServiceResult service_result;

    public NPOSecurityMessageReply() {
    }

    public NPOSecurityMessageReply(
           se.carelink.webservices.npo.security.ServiceResult service_result) {
           this.service_result = service_result;
    }


    /**
     * Gets the service_result value for this NPOSecurityMessageReply.
     * 
     * @return service_result
     */
    public se.carelink.webservices.npo.security.ServiceResult getService_result() {
        return service_result;
    }


    /**
     * Sets the service_result value for this NPOSecurityMessageReply.
     * 
     * @param service_result
     */
    public void setService_result(se.carelink.webservices.npo.security.ServiceResult service_result) {
        this.service_result = service_result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NPOSecurityMessageReply)) return false;
        NPOSecurityMessageReply other = (NPOSecurityMessageReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service_result==null && other.getService_result()==null) || 
             (this.service_result!=null &&
              this.service_result.equals(other.getService_result())));
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
        if (getService_result() != null) {
            _hashCode += getService_result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NPOSecurityMessageReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "NPOSecurityMessageReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "service_result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "ServiceResult"));
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
