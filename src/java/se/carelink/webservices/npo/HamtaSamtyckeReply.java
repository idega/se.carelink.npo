/**
 * HamtaSamtyckeReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class HamtaSamtyckeReply  extends se.carelink.webservices.npo.NPOMessageReply  implements java.io.Serializable {
    private se.carelink.webservices.npo.Samtycke samtycke;

    public HamtaSamtyckeReply() {
    }

    public HamtaSamtyckeReply(
           se.carelink.webservices.npo.Samtycke samtycke) {
           this.samtycke = samtycke;
    }


    /**
     * Gets the samtycke value for this HamtaSamtyckeReply.
     * 
     * @return samtycke
     */
    public se.carelink.webservices.npo.Samtycke getSamtycke() {
        return samtycke;
    }


    /**
     * Sets the samtycke value for this HamtaSamtyckeReply.
     * 
     * @param samtycke
     */
    public void setSamtycke(se.carelink.webservices.npo.Samtycke samtycke) {
        this.samtycke = samtycke;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HamtaSamtyckeReply)) return false;
        HamtaSamtyckeReply other = (HamtaSamtyckeReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.samtycke==null && other.getSamtycke()==null) || 
             (this.samtycke!=null &&
              this.samtycke.equals(other.getSamtycke())));
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
        if (getSamtycke() != null) {
            _hashCode += getSamtycke().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HamtaSamtyckeReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaSamtyckeReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samtycke");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "samtycke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Samtycke"));
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
