/**
 * TicketParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo.security;

public class TicketParameters  implements java.io.Serializable {
    private java.lang.String source_domain_auth_method;
    private java.util.Calendar authentication_instant;
    private java.lang.String source_domain_user_id;
    private se.carelink.webservices.npo.security.ArrayOfString source_domain_user_roles;
    private java.util.Calendar not_before;
    private java.util.Calendar not_on_or_after;
    private java.lang.String source_domain_id;

    public TicketParameters() {
    }

    public TicketParameters(
           java.lang.String source_domain_auth_method,
           java.util.Calendar authentication_instant,
           java.lang.String source_domain_user_id,
           se.carelink.webservices.npo.security.ArrayOfString source_domain_user_roles,
           java.util.Calendar not_before,
           java.util.Calendar not_on_or_after,
           java.lang.String source_domain_id) {
           this.source_domain_auth_method = source_domain_auth_method;
           this.authentication_instant = authentication_instant;
           this.source_domain_user_id = source_domain_user_id;
           this.source_domain_user_roles = source_domain_user_roles;
           this.not_before = not_before;
           this.not_on_or_after = not_on_or_after;
           this.source_domain_id = source_domain_id;
    }


    /**
     * Gets the source_domain_auth_method value for this TicketParameters.
     * 
     * @return source_domain_auth_method
     */
    public java.lang.String getSource_domain_auth_method() {
        return source_domain_auth_method;
    }


    /**
     * Sets the source_domain_auth_method value for this TicketParameters.
     * 
     * @param source_domain_auth_method
     */
    public void setSource_domain_auth_method(java.lang.String source_domain_auth_method) {
        this.source_domain_auth_method = source_domain_auth_method;
    }


    /**
     * Gets the authentication_instant value for this TicketParameters.
     * 
     * @return authentication_instant
     */
    public java.util.Calendar getAuthentication_instant() {
        return authentication_instant;
    }


    /**
     * Sets the authentication_instant value for this TicketParameters.
     * 
     * @param authentication_instant
     */
    public void setAuthentication_instant(java.util.Calendar authentication_instant) {
        this.authentication_instant = authentication_instant;
    }


    /**
     * Gets the source_domain_user_id value for this TicketParameters.
     * 
     * @return source_domain_user_id
     */
    public java.lang.String getSource_domain_user_id() {
        return source_domain_user_id;
    }


    /**
     * Sets the source_domain_user_id value for this TicketParameters.
     * 
     * @param source_domain_user_id
     */
    public void setSource_domain_user_id(java.lang.String source_domain_user_id) {
        this.source_domain_user_id = source_domain_user_id;
    }


    /**
     * Gets the source_domain_user_roles value for this TicketParameters.
     * 
     * @return source_domain_user_roles
     */
    public se.carelink.webservices.npo.security.ArrayOfString getSource_domain_user_roles() {
        return source_domain_user_roles;
    }


    /**
     * Sets the source_domain_user_roles value for this TicketParameters.
     * 
     * @param source_domain_user_roles
     */
    public void setSource_domain_user_roles(se.carelink.webservices.npo.security.ArrayOfString source_domain_user_roles) {
        this.source_domain_user_roles = source_domain_user_roles;
    }


    /**
     * Gets the not_before value for this TicketParameters.
     * 
     * @return not_before
     */
    public java.util.Calendar getNot_before() {
        return not_before;
    }


    /**
     * Sets the not_before value for this TicketParameters.
     * 
     * @param not_before
     */
    public void setNot_before(java.util.Calendar not_before) {
        this.not_before = not_before;
    }


    /**
     * Gets the not_on_or_after value for this TicketParameters.
     * 
     * @return not_on_or_after
     */
    public java.util.Calendar getNot_on_or_after() {
        return not_on_or_after;
    }


    /**
     * Sets the not_on_or_after value for this TicketParameters.
     * 
     * @param not_on_or_after
     */
    public void setNot_on_or_after(java.util.Calendar not_on_or_after) {
        this.not_on_or_after = not_on_or_after;
    }


    /**
     * Gets the source_domain_id value for this TicketParameters.
     * 
     * @return source_domain_id
     */
    public java.lang.String getSource_domain_id() {
        return source_domain_id;
    }


    /**
     * Sets the source_domain_id value for this TicketParameters.
     * 
     * @param source_domain_id
     */
    public void setSource_domain_id(java.lang.String source_domain_id) {
        this.source_domain_id = source_domain_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketParameters)) return false;
        TicketParameters other = (TicketParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.source_domain_auth_method==null && other.getSource_domain_auth_method()==null) || 
             (this.source_domain_auth_method!=null &&
              this.source_domain_auth_method.equals(other.getSource_domain_auth_method()))) &&
            ((this.authentication_instant==null && other.getAuthentication_instant()==null) || 
             (this.authentication_instant!=null &&
              this.authentication_instant.equals(other.getAuthentication_instant()))) &&
            ((this.source_domain_user_id==null && other.getSource_domain_user_id()==null) || 
             (this.source_domain_user_id!=null &&
              this.source_domain_user_id.equals(other.getSource_domain_user_id()))) &&
            ((this.source_domain_user_roles==null && other.getSource_domain_user_roles()==null) || 
             (this.source_domain_user_roles!=null &&
              this.source_domain_user_roles.equals(other.getSource_domain_user_roles()))) &&
            ((this.not_before==null && other.getNot_before()==null) || 
             (this.not_before!=null &&
              this.not_before.equals(other.getNot_before()))) &&
            ((this.not_on_or_after==null && other.getNot_on_or_after()==null) || 
             (this.not_on_or_after!=null &&
              this.not_on_or_after.equals(other.getNot_on_or_after()))) &&
            ((this.source_domain_id==null && other.getSource_domain_id()==null) || 
             (this.source_domain_id!=null &&
              this.source_domain_id.equals(other.getSource_domain_id())));
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
        if (getSource_domain_auth_method() != null) {
            _hashCode += getSource_domain_auth_method().hashCode();
        }
        if (getAuthentication_instant() != null) {
            _hashCode += getAuthentication_instant().hashCode();
        }
        if (getSource_domain_user_id() != null) {
            _hashCode += getSource_domain_user_id().hashCode();
        }
        if (getSource_domain_user_roles() != null) {
            _hashCode += getSource_domain_user_roles().hashCode();
        }
        if (getNot_before() != null) {
            _hashCode += getNot_before().hashCode();
        }
        if (getNot_on_or_after() != null) {
            _hashCode += getNot_on_or_after().hashCode();
        }
        if (getSource_domain_id() != null) {
            _hashCode += getSource_domain_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "TicketParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_domain_auth_method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "source_domain_auth_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication_instant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "authentication_instant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_domain_user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "source_domain_user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_domain_user_roles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "source_domain_user_roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("not_before");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "not_before"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("not_on_or_after");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "not_on_or_after"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_domain_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo/security", "source_domain_id"));
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
