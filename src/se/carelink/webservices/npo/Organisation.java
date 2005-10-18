/**
 * Organisation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class Organisation  implements java.io.Serializable {
    private se.carelink.webservices.npo.Org_id org_id;
    private java.lang.String namn;

    public Organisation() {
    }

    public Organisation(
           se.carelink.webservices.npo.Org_id org_id,
           java.lang.String namn) {
           this.org_id = org_id;
           this.namn = namn;
    }


    /**
     * Gets the org_id value for this Organisation.
     * 
     * @return org_id
     */
    public se.carelink.webservices.npo.Org_id getOrg_id() {
        return org_id;
    }


    /**
     * Sets the org_id value for this Organisation.
     * 
     * @param org_id
     */
    public void setOrg_id(se.carelink.webservices.npo.Org_id org_id) {
        this.org_id = org_id;
    }


    /**
     * Gets the namn value for this Organisation.
     * 
     * @return namn
     */
    public java.lang.String getNamn() {
        return namn;
    }


    /**
     * Sets the namn value for this Organisation.
     * 
     * @param namn
     */
    public void setNamn(java.lang.String namn) {
        this.namn = namn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Organisation)) return false;
        Organisation other = (Organisation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.org_id==null && other.getOrg_id()==null) || 
             (this.org_id!=null &&
              this.org_id.equals(other.getOrg_id()))) &&
            ((this.namn==null && other.getNamn()==null) || 
             (this.namn!=null &&
              this.namn.equals(other.getNamn())));
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
        if (getOrg_id() != null) {
            _hashCode += getOrg_id().hashCode();
        }
        if (getNamn() != null) {
            _hashCode += getNamn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Organisation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Organisation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "org_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Org_id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "namn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
