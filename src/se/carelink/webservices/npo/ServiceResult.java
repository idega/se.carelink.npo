/**
 * ServiceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class ServiceResult  implements java.io.Serializable {
    private int major;
    private int minor;
    private java.lang.String error_msg;
    private java.lang.String log_line_ref;

    public ServiceResult() {
    }

    public ServiceResult(
           int major,
           int minor,
           java.lang.String error_msg,
           java.lang.String log_line_ref) {
           this.major = major;
           this.minor = minor;
           this.error_msg = error_msg;
           this.log_line_ref = log_line_ref;
    }


    /**
     * Gets the major value for this ServiceResult.
     * 
     * @return major
     */
    public int getMajor() {
        return major;
    }


    /**
     * Sets the major value for this ServiceResult.
     * 
     * @param major
     */
    public void setMajor(int major) {
        this.major = major;
    }


    /**
     * Gets the minor value for this ServiceResult.
     * 
     * @return minor
     */
    public int getMinor() {
        return minor;
    }


    /**
     * Sets the minor value for this ServiceResult.
     * 
     * @param minor
     */
    public void setMinor(int minor) {
        this.minor = minor;
    }


    /**
     * Gets the error_msg value for this ServiceResult.
     * 
     * @return error_msg
     */
    public java.lang.String getError_msg() {
        return error_msg;
    }


    /**
     * Sets the error_msg value for this ServiceResult.
     * 
     * @param error_msg
     */
    public void setError_msg(java.lang.String error_msg) {
        this.error_msg = error_msg;
    }


    /**
     * Gets the log_line_ref value for this ServiceResult.
     * 
     * @return log_line_ref
     */
    public java.lang.String getLog_line_ref() {
        return log_line_ref;
    }


    /**
     * Sets the log_line_ref value for this ServiceResult.
     * 
     * @param log_line_ref
     */
    public void setLog_line_ref(java.lang.String log_line_ref) {
        this.log_line_ref = log_line_ref;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceResult)) return false;
        ServiceResult other = (ServiceResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.major == other.getMajor() &&
            this.minor == other.getMinor() &&
            ((this.error_msg==null && other.getError_msg()==null) || 
             (this.error_msg!=null &&
              this.error_msg.equals(other.getError_msg()))) &&
            ((this.log_line_ref==null && other.getLog_line_ref()==null) || 
             (this.log_line_ref!=null &&
              this.log_line_ref.equals(other.getLog_line_ref())));
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
        _hashCode += getMajor();
        _hashCode += getMinor();
        if (getError_msg() != null) {
            _hashCode += getError_msg().hashCode();
        }
        if (getLog_line_ref() != null) {
            _hashCode += getLog_line_ref().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ServiceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("major");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "major"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "minor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "error_msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("log_line_ref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "log_line_ref"));
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
