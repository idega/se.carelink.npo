/**
 * LoggedMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class LoggedMessage  implements java.io.Serializable {
    private java.lang.String calling_system;
    private java.lang.String operation;
    private java.lang.String patient_pnr;
    private se.carelink.webservices.npo.ID vdoc_id;
    private se.carelink.webservices.npo.ID org_id;
    private java.lang.String npo_typ;
    private java.lang.String extra;
    private java.lang.String source_domain_user_id;
    private boolean nodlage;
    private java.util.Calendar reg_date;

    public LoggedMessage() {
    }

    public LoggedMessage(
           java.lang.String calling_system,
           java.lang.String operation,
           java.lang.String patient_pnr,
           se.carelink.webservices.npo.ID vdoc_id,
           se.carelink.webservices.npo.ID org_id,
           java.lang.String npo_typ,
           java.lang.String extra,
           java.lang.String source_domain_user_id,
           boolean nodlage,
           java.util.Calendar reg_date) {
           this.calling_system = calling_system;
           this.operation = operation;
           this.patient_pnr = patient_pnr;
           this.vdoc_id = vdoc_id;
           this.org_id = org_id;
           this.npo_typ = npo_typ;
           this.extra = extra;
           this.source_domain_user_id = source_domain_user_id;
           this.nodlage = nodlage;
           this.reg_date = reg_date;
    }


    /**
     * Gets the calling_system value for this LoggedMessage.
     * 
     * @return calling_system
     */
    public java.lang.String getCalling_system() {
        return calling_system;
    }


    /**
     * Sets the calling_system value for this LoggedMessage.
     * 
     * @param calling_system
     */
    public void setCalling_system(java.lang.String calling_system) {
        this.calling_system = calling_system;
    }


    /**
     * Gets the operation value for this LoggedMessage.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this LoggedMessage.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the patient_pnr value for this LoggedMessage.
     * 
     * @return patient_pnr
     */
    public java.lang.String getPatient_pnr() {
        return patient_pnr;
    }


    /**
     * Sets the patient_pnr value for this LoggedMessage.
     * 
     * @param patient_pnr
     */
    public void setPatient_pnr(java.lang.String patient_pnr) {
        this.patient_pnr = patient_pnr;
    }


    /**
     * Gets the vdoc_id value for this LoggedMessage.
     * 
     * @return vdoc_id
     */
    public se.carelink.webservices.npo.ID getVdoc_id() {
        return vdoc_id;
    }


    /**
     * Sets the vdoc_id value for this LoggedMessage.
     * 
     * @param vdoc_id
     */
    public void setVdoc_id(se.carelink.webservices.npo.ID vdoc_id) {
        this.vdoc_id = vdoc_id;
    }


    /**
     * Gets the org_id value for this LoggedMessage.
     * 
     * @return org_id
     */
    public se.carelink.webservices.npo.ID getOrg_id() {
        return org_id;
    }


    /**
     * Sets the org_id value for this LoggedMessage.
     * 
     * @param org_id
     */
    public void setOrg_id(se.carelink.webservices.npo.ID org_id) {
        this.org_id = org_id;
    }


    /**
     * Gets the npo_typ value for this LoggedMessage.
     * 
     * @return npo_typ
     */
    public java.lang.String getNpo_typ() {
        return npo_typ;
    }


    /**
     * Sets the npo_typ value for this LoggedMessage.
     * 
     * @param npo_typ
     */
    public void setNpo_typ(java.lang.String npo_typ) {
        this.npo_typ = npo_typ;
    }


    /**
     * Gets the extra value for this LoggedMessage.
     * 
     * @return extra
     */
    public java.lang.String getExtra() {
        return extra;
    }


    /**
     * Sets the extra value for this LoggedMessage.
     * 
     * @param extra
     */
    public void setExtra(java.lang.String extra) {
        this.extra = extra;
    }


    /**
     * Gets the source_domain_user_id value for this LoggedMessage.
     * 
     * @return source_domain_user_id
     */
    public java.lang.String getSource_domain_user_id() {
        return source_domain_user_id;
    }


    /**
     * Sets the source_domain_user_id value for this LoggedMessage.
     * 
     * @param source_domain_user_id
     */
    public void setSource_domain_user_id(java.lang.String source_domain_user_id) {
        this.source_domain_user_id = source_domain_user_id;
    }


    /**
     * Gets the nodlage value for this LoggedMessage.
     * 
     * @return nodlage
     */
    public boolean isNodlage() {
        return nodlage;
    }


    /**
     * Sets the nodlage value for this LoggedMessage.
     * 
     * @param nodlage
     */
    public void setNodlage(boolean nodlage) {
        this.nodlage = nodlage;
    }


    /**
     * Gets the reg_date value for this LoggedMessage.
     * 
     * @return reg_date
     */
    public java.util.Calendar getReg_date() {
        return reg_date;
    }


    /**
     * Sets the reg_date value for this LoggedMessage.
     * 
     * @param reg_date
     */
    public void setReg_date(java.util.Calendar reg_date) {
        this.reg_date = reg_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoggedMessage)) return false;
        LoggedMessage other = (LoggedMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calling_system==null && other.getCalling_system()==null) || 
             (this.calling_system!=null &&
              this.calling_system.equals(other.getCalling_system()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.patient_pnr==null && other.getPatient_pnr()==null) || 
             (this.patient_pnr!=null &&
              this.patient_pnr.equals(other.getPatient_pnr()))) &&
            ((this.vdoc_id==null && other.getVdoc_id()==null) || 
             (this.vdoc_id!=null &&
              this.vdoc_id.equals(other.getVdoc_id()))) &&
            ((this.org_id==null && other.getOrg_id()==null) || 
             (this.org_id!=null &&
              this.org_id.equals(other.getOrg_id()))) &&
            ((this.npo_typ==null && other.getNpo_typ()==null) || 
             (this.npo_typ!=null &&
              this.npo_typ.equals(other.getNpo_typ()))) &&
            ((this.extra==null && other.getExtra()==null) || 
             (this.extra!=null &&
              this.extra.equals(other.getExtra()))) &&
            ((this.source_domain_user_id==null && other.getSource_domain_user_id()==null) || 
             (this.source_domain_user_id!=null &&
              this.source_domain_user_id.equals(other.getSource_domain_user_id()))) &&
            this.nodlage == other.isNodlage() &&
            ((this.reg_date==null && other.getReg_date()==null) || 
             (this.reg_date!=null &&
              this.reg_date.equals(other.getReg_date())));
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
        if (getCalling_system() != null) {
            _hashCode += getCalling_system().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getPatient_pnr() != null) {
            _hashCode += getPatient_pnr().hashCode();
        }
        if (getVdoc_id() != null) {
            _hashCode += getVdoc_id().hashCode();
        }
        if (getOrg_id() != null) {
            _hashCode += getOrg_id().hashCode();
        }
        if (getNpo_typ() != null) {
            _hashCode += getNpo_typ().hashCode();
        }
        if (getExtra() != null) {
            _hashCode += getExtra().hashCode();
        }
        if (getSource_domain_user_id() != null) {
            _hashCode += getSource_domain_user_id().hashCode();
        }
        _hashCode += (isNodlage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReg_date() != null) {
            _hashCode += getReg_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoggedMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "LoggedMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calling_system");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "calling_system"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patient_pnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "patient_pnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vdoc_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "vdoc_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "org_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npo_typ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "npo_typ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "extra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_domain_user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "source_domain_user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodlage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Nodlage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "reg_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
