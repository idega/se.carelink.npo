/**
 * HamtaPersonuppgifterReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class HamtaPersonuppgifterReply  extends se.carelink.webservices.npo.NPOMessageReply  implements java.io.Serializable {
    private se.carelink.webservices.npo.Personuppgifter personuppgifter;

    public HamtaPersonuppgifterReply() {
    }

    public HamtaPersonuppgifterReply(
           se.carelink.webservices.npo.Personuppgifter personuppgifter) {
           this.personuppgifter = personuppgifter;
    }


    /**
     * Gets the personuppgifter value for this HamtaPersonuppgifterReply.
     * 
     * @return personuppgifter
     */
    public se.carelink.webservices.npo.Personuppgifter getPersonuppgifter() {
        return personuppgifter;
    }


    /**
     * Sets the personuppgifter value for this HamtaPersonuppgifterReply.
     * 
     * @param personuppgifter
     */
    public void setPersonuppgifter(se.carelink.webservices.npo.Personuppgifter personuppgifter) {
        this.personuppgifter = personuppgifter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HamtaPersonuppgifterReply)) return false;
        HamtaPersonuppgifterReply other = (HamtaPersonuppgifterReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.personuppgifter==null && other.getPersonuppgifter()==null) || 
             (this.personuppgifter!=null &&
              this.personuppgifter.equals(other.getPersonuppgifter())));
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
        if (getPersonuppgifter() != null) {
            _hashCode += getPersonuppgifter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HamtaPersonuppgifterReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaPersonuppgifterReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personuppgifter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "personuppgifter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Personuppgifter"));
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
