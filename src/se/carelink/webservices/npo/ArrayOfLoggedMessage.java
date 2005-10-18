/**
 * ArrayOfLoggedMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class ArrayOfLoggedMessage  implements java.io.Serializable {
    private se.carelink.webservices.npo.LoggedMessage[] loggedMessage;

    public ArrayOfLoggedMessage() {
    }

    public ArrayOfLoggedMessage(
           se.carelink.webservices.npo.LoggedMessage[] loggedMessage) {
           this.loggedMessage = loggedMessage;
    }


    /**
     * Gets the loggedMessage value for this ArrayOfLoggedMessage.
     * 
     * @return loggedMessage
     */
    public se.carelink.webservices.npo.LoggedMessage[] getLoggedMessage() {
        return loggedMessage;
    }


    /**
     * Sets the loggedMessage value for this ArrayOfLoggedMessage.
     * 
     * @param loggedMessage
     */
    public void setLoggedMessage(se.carelink.webservices.npo.LoggedMessage[] loggedMessage) {
        this.loggedMessage = loggedMessage;
    }

    public se.carelink.webservices.npo.LoggedMessage getLoggedMessage(int i) {
        return this.loggedMessage[i];
    }

    public void setLoggedMessage(int i, se.carelink.webservices.npo.LoggedMessage _value) {
        this.loggedMessage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfLoggedMessage)) return false;
        ArrayOfLoggedMessage other = (ArrayOfLoggedMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loggedMessage==null && other.getLoggedMessage()==null) || 
             (this.loggedMessage!=null &&
              java.util.Arrays.equals(this.loggedMessage, other.getLoggedMessage())));
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
        if (getLoggedMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoggedMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoggedMessage(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfLoggedMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ArrayOfLoggedMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggedMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "LoggedMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "LoggedMessage"));
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
