/**
 * Samtycke.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class Samtycke  implements java.io.Serializable {
    private java.lang.String pnr;
    private java.lang.String huvudman;
    private se.carelink.webservices.npo.SamtyckeTypEnum samtycke_typ;
    private java.lang.String samtycke_subtyp;
    private se.carelink.webservices.npo.SamtyckeStatusEnum status;
    private java.util.Calendar reg_date;
    private java.lang.String reg_vdg_id;
    private java.util.Calendar valid_until;

    public Samtycke() {
    }

    public Samtycke(
           java.lang.String pnr,
           java.lang.String huvudman,
           se.carelink.webservices.npo.SamtyckeTypEnum samtycke_typ,
           java.lang.String samtycke_subtyp,
           se.carelink.webservices.npo.SamtyckeStatusEnum status,
           java.util.Calendar reg_date,
           java.lang.String reg_vdg_id,
           java.util.Calendar valid_until) {
           this.pnr = pnr;
           this.huvudman = huvudman;
           this.samtycke_typ = samtycke_typ;
           this.samtycke_subtyp = samtycke_subtyp;
           this.status = status;
           this.reg_date = reg_date;
           this.reg_vdg_id = reg_vdg_id;
           this.valid_until = valid_until;
    }


    /**
     * Gets the pnr value for this Samtycke.
     * 
     * @return pnr
     */
    public java.lang.String getPnr() {
        return pnr;
    }


    /**
     * Sets the pnr value for this Samtycke.
     * 
     * @param pnr
     */
    public void setPnr(java.lang.String pnr) {
        this.pnr = pnr;
    }


    /**
     * Gets the huvudman value for this Samtycke.
     * 
     * @return huvudman
     */
    public java.lang.String getHuvudman() {
        return huvudman;
    }


    /**
     * Sets the huvudman value for this Samtycke.
     * 
     * @param huvudman
     */
    public void setHuvudman(java.lang.String huvudman) {
        this.huvudman = huvudman;
    }


    /**
     * Gets the samtycke_typ value for this Samtycke.
     * 
     * @return samtycke_typ
     */
    public se.carelink.webservices.npo.SamtyckeTypEnum getSamtycke_typ() {
        return samtycke_typ;
    }


    /**
     * Sets the samtycke_typ value for this Samtycke.
     * 
     * @param samtycke_typ
     */
    public void setSamtycke_typ(se.carelink.webservices.npo.SamtyckeTypEnum samtycke_typ) {
        this.samtycke_typ = samtycke_typ;
    }


    /**
     * Gets the samtycke_subtyp value for this Samtycke.
     * 
     * @return samtycke_subtyp
     */
    public java.lang.String getSamtycke_subtyp() {
        return samtycke_subtyp;
    }


    /**
     * Sets the samtycke_subtyp value for this Samtycke.
     * 
     * @param samtycke_subtyp
     */
    public void setSamtycke_subtyp(java.lang.String samtycke_subtyp) {
        this.samtycke_subtyp = samtycke_subtyp;
    }


    /**
     * Gets the status value for this Samtycke.
     * 
     * @return status
     */
    public se.carelink.webservices.npo.SamtyckeStatusEnum getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Samtycke.
     * 
     * @param status
     */
    public void setStatus(se.carelink.webservices.npo.SamtyckeStatusEnum status) {
        this.status = status;
    }


    /**
     * Gets the reg_date value for this Samtycke.
     * 
     * @return reg_date
     */
    public java.util.Calendar getReg_date() {
        return reg_date;
    }


    /**
     * Sets the reg_date value for this Samtycke.
     * 
     * @param reg_date
     */
    public void setReg_date(java.util.Calendar reg_date) {
        this.reg_date = reg_date;
    }


    /**
     * Gets the reg_vdg_id value for this Samtycke.
     * 
     * @return reg_vdg_id
     */
    public java.lang.String getReg_vdg_id() {
        return reg_vdg_id;
    }


    /**
     * Sets the reg_vdg_id value for this Samtycke.
     * 
     * @param reg_vdg_id
     */
    public void setReg_vdg_id(java.lang.String reg_vdg_id) {
        this.reg_vdg_id = reg_vdg_id;
    }


    /**
     * Gets the valid_until value for this Samtycke.
     * 
     * @return valid_until
     */
    public java.util.Calendar getValid_until() {
        return valid_until;
    }


    /**
     * Sets the valid_until value for this Samtycke.
     * 
     * @param valid_until
     */
    public void setValid_until(java.util.Calendar valid_until) {
        this.valid_until = valid_until;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Samtycke)) return false;
        Samtycke other = (Samtycke) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pnr==null && other.getPnr()==null) || 
             (this.pnr!=null &&
              this.pnr.equals(other.getPnr()))) &&
            ((this.huvudman==null && other.getHuvudman()==null) || 
             (this.huvudman!=null &&
              this.huvudman.equals(other.getHuvudman()))) &&
            ((this.samtycke_typ==null && other.getSamtycke_typ()==null) || 
             (this.samtycke_typ!=null &&
              this.samtycke_typ.equals(other.getSamtycke_typ()))) &&
            ((this.samtycke_subtyp==null && other.getSamtycke_subtyp()==null) || 
             (this.samtycke_subtyp!=null &&
              this.samtycke_subtyp.equals(other.getSamtycke_subtyp()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.reg_date==null && other.getReg_date()==null) || 
             (this.reg_date!=null &&
              this.reg_date.equals(other.getReg_date()))) &&
            ((this.reg_vdg_id==null && other.getReg_vdg_id()==null) || 
             (this.reg_vdg_id!=null &&
              this.reg_vdg_id.equals(other.getReg_vdg_id()))) &&
            ((this.valid_until==null && other.getValid_until()==null) || 
             (this.valid_until!=null &&
              this.valid_until.equals(other.getValid_until())));
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
        if (getPnr() != null) {
            _hashCode += getPnr().hashCode();
        }
        if (getHuvudman() != null) {
            _hashCode += getHuvudman().hashCode();
        }
        if (getSamtycke_typ() != null) {
            _hashCode += getSamtycke_typ().hashCode();
        }
        if (getSamtycke_subtyp() != null) {
            _hashCode += getSamtycke_subtyp().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getReg_date() != null) {
            _hashCode += getReg_date().hashCode();
        }
        if (getReg_vdg_id() != null) {
            _hashCode += getReg_vdg_id().hashCode();
        }
        if (getValid_until() != null) {
            _hashCode += getValid_until().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Samtycke.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Samtycke"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "pnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huvudman");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "huvudman"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samtycke_typ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "samtycke_typ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "SamtyckeTypEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samtycke_subtyp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "samtycke_subtyp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "SamtyckeStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "reg_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_vdg_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "reg_vdg_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_until");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "valid_until"));
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
