/**
 * HamtaVarddokumentReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class HamtaVarddokumentReply  extends se.carelink.webservices.npo.NPOMessageReply  implements java.io.Serializable {
    private se.carelink.webservices.npo.Kuvert[] kuvert;

    public HamtaVarddokumentReply() {
    }

    public HamtaVarddokumentReply(
           se.carelink.webservices.npo.Kuvert[] kuvert) {
           this.kuvert = kuvert;
    }


    /**
     * Gets the kuvert value for this HamtaVarddokumentReply.
     * 
     * @return kuvert
     */
    public se.carelink.webservices.npo.Kuvert[] getKuvert() {
        return kuvert;
    }


    /**
     * Sets the kuvert value for this HamtaVarddokumentReply.
     * 
     * @param kuvert
     */
    public void setKuvert(se.carelink.webservices.npo.Kuvert[] kuvert) {
        this.kuvert = kuvert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HamtaVarddokumentReply)) return false;
        HamtaVarddokumentReply other = (HamtaVarddokumentReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.kuvert==null && other.getKuvert()==null) || 
             (this.kuvert!=null &&
              java.util.Arrays.equals(this.kuvert, other.getKuvert())));
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
        if (getKuvert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKuvert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKuvert(), i);
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
        new org.apache.axis.description.TypeDesc(HamtaVarddokumentReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kuvert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "kuvert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Kuvert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Kuvert"));
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
