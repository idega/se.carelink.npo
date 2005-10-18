/**
 * HOS_person.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class HOS_person  implements java.io.Serializable {
    private se.carelink.webservices.npo.Pers_id pers_id;
    private java.lang.String namn;
    private se.carelink.webservices.npo.Organisation org;

    public HOS_person() {
    }

    public HOS_person(
           se.carelink.webservices.npo.Pers_id pers_id,
           java.lang.String namn,
           se.carelink.webservices.npo.Organisation org) {
           this.pers_id = pers_id;
           this.namn = namn;
           this.org = org;
    }


    /**
     * Gets the pers_id value for this HOS_person.
     * 
     * @return pers_id
     */
    public se.carelink.webservices.npo.Pers_id getPers_id() {
        return pers_id;
    }


    /**
     * Sets the pers_id value for this HOS_person.
     * 
     * @param pers_id
     */
    public void setPers_id(se.carelink.webservices.npo.Pers_id pers_id) {
        this.pers_id = pers_id;
    }


    /**
     * Gets the namn value for this HOS_person.
     * 
     * @return namn
     */
    public java.lang.String getNamn() {
        return namn;
    }


    /**
     * Sets the namn value for this HOS_person.
     * 
     * @param namn
     */
    public void setNamn(java.lang.String namn) {
        this.namn = namn;
    }


    /**
     * Gets the org value for this HOS_person.
     * 
     * @return org
     */
    public se.carelink.webservices.npo.Organisation getOrg() {
        return org;
    }


    /**
     * Sets the org value for this HOS_person.
     * 
     * @param org
     */
    public void setOrg(se.carelink.webservices.npo.Organisation org) {
        this.org = org;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HOS_person)) return false;
        HOS_person other = (HOS_person) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pers_id==null && other.getPers_id()==null) || 
             (this.pers_id!=null &&
              this.pers_id.equals(other.getPers_id()))) &&
            ((this.namn==null && other.getNamn()==null) || 
             (this.namn!=null &&
              this.namn.equals(other.getNamn()))) &&
            ((this.org==null && other.getOrg()==null) || 
             (this.org!=null &&
              this.org.equals(other.getOrg())));
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
        if (getPers_id() != null) {
            _hashCode += getPers_id().hashCode();
        }
        if (getNamn() != null) {
            _hashCode += getNamn().hashCode();
        }
        if (getOrg() != null) {
            _hashCode += getOrg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HOS_person.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HOS_person"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pers_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "pers_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Pers_id"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "org"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Organisation"));
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
