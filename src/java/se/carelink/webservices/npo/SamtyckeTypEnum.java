/**
 * SamtyckeTypEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class SamtyckeTypEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SamtyckeTypEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Samtycke1 = "Samtycke1";
    public static final java.lang.String _Vardrelation = "Vardrelation";
    public static final SamtyckeTypEnum Samtycke1 = new SamtyckeTypEnum(_Samtycke1);
    public static final SamtyckeTypEnum Vardrelation = new SamtyckeTypEnum(_Vardrelation);
    public java.lang.String getValue() { return _value_;}
    public static SamtyckeTypEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SamtyckeTypEnum enumeration = (SamtyckeTypEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SamtyckeTypEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SamtyckeTypEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "SamtyckeTypEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
