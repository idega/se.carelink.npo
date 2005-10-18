/**
 * ArrayOfVD_id.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class ArrayOfVD_id  implements java.io.Serializable {
    private se.carelink.webservices.npo.VD_id[] VD_id;

    public ArrayOfVD_id() {
    }

    public ArrayOfVD_id(
           se.carelink.webservices.npo.VD_id[] VD_id) {
           this.VD_id = VD_id;
    }


    /**
     * Gets the VD_id value for this ArrayOfVD_id.
     * 
     * @return VD_id
     */
    public se.carelink.webservices.npo.VD_id[] getVD_id() {
        return VD_id;
    }


    /**
     * Sets the VD_id value for this ArrayOfVD_id.
     * 
     * @param VD_id
     */
    public void setVD_id(se.carelink.webservices.npo.VD_id[] VD_id) {
        this.VD_id = VD_id;
    }

    public se.carelink.webservices.npo.VD_id getVD_id(int i) {
        return this.VD_id[i];
    }

    public void setVD_id(int i, se.carelink.webservices.npo.VD_id _value) {
        this.VD_id[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVD_id)) return false;
        ArrayOfVD_id other = (ArrayOfVD_id) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VD_id==null && other.getVD_id()==null) || 
             (this.VD_id!=null &&
              java.util.Arrays.equals(this.VD_id, other.getVD_id())));
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
        if (getVD_id() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVD_id());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVD_id(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVD_id.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ArrayOfVD_id"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VD_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "VD_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "VD_id"));
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
