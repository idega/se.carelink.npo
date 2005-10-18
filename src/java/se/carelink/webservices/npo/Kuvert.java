/**
 * Kuvert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class Kuvert  implements java.io.Serializable {
    private se.carelink.webservices.npo.VD_id vd_id;
    private java.lang.String pnr_patient;
    private java.lang.String patient_namn;
    private se.carelink.webservices.npo.HOS_person hos_person;
    private java.util.Calendar tidsstampel;
    private java.lang.String npo_typ;
    private java.lang.String content;

    public Kuvert() {
    }

    public Kuvert(
           se.carelink.webservices.npo.VD_id vd_id,
           java.lang.String pnr_patient,
           java.lang.String patient_namn,
           se.carelink.webservices.npo.HOS_person hos_person,
           java.util.Calendar tidsstampel,
           java.lang.String npo_typ,
           java.lang.String content) {
           this.vd_id = vd_id;
           this.pnr_patient = pnr_patient;
           this.patient_namn = patient_namn;
           this.hos_person = hos_person;
           this.tidsstampel = tidsstampel;
           this.npo_typ = npo_typ;
           this.content = content;
    }


    /**
     * Gets the vd_id value for this Kuvert.
     * 
     * @return vd_id
     */
    public se.carelink.webservices.npo.VD_id getVd_id() {
        return vd_id;
    }


    /**
     * Sets the vd_id value for this Kuvert.
     * 
     * @param vd_id
     */
    public void setVd_id(se.carelink.webservices.npo.VD_id vd_id) {
        this.vd_id = vd_id;
    }


    /**
     * Gets the pnr_patient value for this Kuvert.
     * 
     * @return pnr_patient
     */
    public java.lang.String getPnr_patient() {
        return pnr_patient;
    }


    /**
     * Sets the pnr_patient value for this Kuvert.
     * 
     * @param pnr_patient
     */
    public void setPnr_patient(java.lang.String pnr_patient) {
        this.pnr_patient = pnr_patient;
    }


    /**
     * Gets the patient_namn value for this Kuvert.
     * 
     * @return patient_namn
     */
    public java.lang.String getPatient_namn() {
        return patient_namn;
    }


    /**
     * Sets the patient_namn value for this Kuvert.
     * 
     * @param patient_namn
     */
    public void setPatient_namn(java.lang.String patient_namn) {
        this.patient_namn = patient_namn;
    }


    /**
     * Gets the hos_person value for this Kuvert.
     * 
     * @return hos_person
     */
    public se.carelink.webservices.npo.HOS_person getHos_person() {
        return hos_person;
    }


    /**
     * Sets the hos_person value for this Kuvert.
     * 
     * @param hos_person
     */
    public void setHos_person(se.carelink.webservices.npo.HOS_person hos_person) {
        this.hos_person = hos_person;
    }


    /**
     * Gets the tidsstampel value for this Kuvert.
     * 
     * @return tidsstampel
     */
    public java.util.Calendar getTidsstampel() {
        return tidsstampel;
    }


    /**
     * Sets the tidsstampel value for this Kuvert.
     * 
     * @param tidsstampel
     */
    public void setTidsstampel(java.util.Calendar tidsstampel) {
        this.tidsstampel = tidsstampel;
    }


    /**
     * Gets the npo_typ value for this Kuvert.
     * 
     * @return npo_typ
     */
    public java.lang.String getNpo_typ() {
        return npo_typ;
    }


    /**
     * Sets the npo_typ value for this Kuvert.
     * 
     * @param npo_typ
     */
    public void setNpo_typ(java.lang.String npo_typ) {
        this.npo_typ = npo_typ;
    }


    /**
     * Gets the content value for this Kuvert.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this Kuvert.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kuvert)) return false;
        Kuvert other = (Kuvert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vd_id==null && other.getVd_id()==null) || 
             (this.vd_id!=null &&
              this.vd_id.equals(other.getVd_id()))) &&
            ((this.pnr_patient==null && other.getPnr_patient()==null) || 
             (this.pnr_patient!=null &&
              this.pnr_patient.equals(other.getPnr_patient()))) &&
            ((this.patient_namn==null && other.getPatient_namn()==null) || 
             (this.patient_namn!=null &&
              this.patient_namn.equals(other.getPatient_namn()))) &&
            ((this.hos_person==null && other.getHos_person()==null) || 
             (this.hos_person!=null &&
              this.hos_person.equals(other.getHos_person()))) &&
            ((this.tidsstampel==null && other.getTidsstampel()==null) || 
             (this.tidsstampel!=null &&
              this.tidsstampel.equals(other.getTidsstampel()))) &&
            ((this.npo_typ==null && other.getNpo_typ()==null) || 
             (this.npo_typ!=null &&
              this.npo_typ.equals(other.getNpo_typ()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent())));
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
        if (getVd_id() != null) {
            _hashCode += getVd_id().hashCode();
        }
        if (getPnr_patient() != null) {
            _hashCode += getPnr_patient().hashCode();
        }
        if (getPatient_namn() != null) {
            _hashCode += getPatient_namn().hashCode();
        }
        if (getHos_person() != null) {
            _hashCode += getHos_person().hashCode();
        }
        if (getTidsstampel() != null) {
            _hashCode += getTidsstampel().hashCode();
        }
        if (getNpo_typ() != null) {
            _hashCode += getNpo_typ().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Kuvert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Kuvert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vd_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "vd_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "VD_id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnr_patient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "pnr_patient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patient_namn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "patient_namn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hos_person");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "hos_person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HOS_person"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tidsstampel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "tidsstampel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "content"));
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
