/**
 * GetSecurityServiceConfigReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class GetSecurityServiceConfigReply  extends se.carelink.webservices.npo.NPOMessageReply  implements java.io.Serializable {
    private se.carelink.webservices.npo.ArrayOfSecurityServiceConfig security_config;

    public GetSecurityServiceConfigReply() {
    }

    public GetSecurityServiceConfigReply(
           se.carelink.webservices.npo.ArrayOfSecurityServiceConfig security_config) {
           this.security_config = security_config;
    }


    /**
     * Gets the security_config value for this GetSecurityServiceConfigReply.
     * 
     * @return security_config
     */
    public se.carelink.webservices.npo.ArrayOfSecurityServiceConfig getSecurity_config() {
        return security_config;
    }


    /**
     * Sets the security_config value for this GetSecurityServiceConfigReply.
     * 
     * @param security_config
     */
    public void setSecurity_config(se.carelink.webservices.npo.ArrayOfSecurityServiceConfig security_config) {
        this.security_config = security_config;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSecurityServiceConfigReply)) return false;
        GetSecurityServiceConfigReply other = (GetSecurityServiceConfigReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.security_config==null && other.getSecurity_config()==null) || 
             (this.security_config!=null &&
              this.security_config.equals(other.getSecurity_config())));
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
        if (getSecurity_config() != null) {
            _hashCode += getSecurity_config().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSecurityServiceConfigReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "GetSecurityServiceConfigReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security_config");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "security_config"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ArrayOfSecurityServiceConfig"));
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
