/**
 * ArrayOfSecurityServiceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class ArrayOfSecurityServiceConfig  implements java.io.Serializable {
    private se.carelink.webservices.npo.SecurityServiceConfig[] securityServiceConfig;

    public ArrayOfSecurityServiceConfig() {
    }

    public ArrayOfSecurityServiceConfig(
           se.carelink.webservices.npo.SecurityServiceConfig[] securityServiceConfig) {
           this.securityServiceConfig = securityServiceConfig;
    }


    /**
     * Gets the securityServiceConfig value for this ArrayOfSecurityServiceConfig.
     * 
     * @return securityServiceConfig
     */
    public se.carelink.webservices.npo.SecurityServiceConfig[] getSecurityServiceConfig() {
        return securityServiceConfig;
    }


    /**
     * Sets the securityServiceConfig value for this ArrayOfSecurityServiceConfig.
     * 
     * @param securityServiceConfig
     */
    public void setSecurityServiceConfig(se.carelink.webservices.npo.SecurityServiceConfig[] securityServiceConfig) {
        this.securityServiceConfig = securityServiceConfig;
    }

    public se.carelink.webservices.npo.SecurityServiceConfig getSecurityServiceConfig(int i) {
        return this.securityServiceConfig[i];
    }

    public void setSecurityServiceConfig(int i, se.carelink.webservices.npo.SecurityServiceConfig _value) {
        this.securityServiceConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSecurityServiceConfig)) return false;
        ArrayOfSecurityServiceConfig other = (ArrayOfSecurityServiceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.securityServiceConfig==null && other.getSecurityServiceConfig()==null) || 
             (this.securityServiceConfig!=null &&
              java.util.Arrays.equals(this.securityServiceConfig, other.getSecurityServiceConfig())));
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
        if (getSecurityServiceConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityServiceConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityServiceConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSecurityServiceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ArrayOfSecurityServiceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "SecurityServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "SecurityServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
