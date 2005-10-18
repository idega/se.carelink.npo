/**
 * Personuppgifter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class Personuppgifter  implements java.io.Serializable {
    private java.lang.String pnr;
    private se.carelink.webservices.npo.KonEnum kon;
    private java.lang.String f_namn;
    private java.lang.String e_namn;
    private java.lang.String m_namn;
    private java.lang.String t_namn;
    private java.lang.String lan;
    private java.lang.String kommun;
    private java.lang.String forsaml;
    private java.lang.String utadr;
    private java.lang.String postnr;
    private java.lang.String postort;
    private java.lang.String avreg_datum;
    private java.lang.String avreg_orsak_kod;

    public Personuppgifter() {
    }

    public Personuppgifter(
           java.lang.String pnr,
           se.carelink.webservices.npo.KonEnum kon,
           java.lang.String f_namn,
           java.lang.String e_namn,
           java.lang.String m_namn,
           java.lang.String t_namn,
           java.lang.String lan,
           java.lang.String kommun,
           java.lang.String forsaml,
           java.lang.String utadr,
           java.lang.String postnr,
           java.lang.String postort,
           java.lang.String avreg_datum,
           java.lang.String avreg_orsak_kod) {
           this.pnr = pnr;
           this.kon = kon;
           this.f_namn = f_namn;
           this.e_namn = e_namn;
           this.m_namn = m_namn;
           this.t_namn = t_namn;
           this.lan = lan;
           this.kommun = kommun;
           this.forsaml = forsaml;
           this.utadr = utadr;
           this.postnr = postnr;
           this.postort = postort;
           this.avreg_datum = avreg_datum;
           this.avreg_orsak_kod = avreg_orsak_kod;
    }


    /**
     * Gets the pnr value for this Personuppgifter.
     * 
     * @return pnr
     */
    public java.lang.String getPnr() {
        return pnr;
    }


    /**
     * Sets the pnr value for this Personuppgifter.
     * 
     * @param pnr
     */
    public void setPnr(java.lang.String pnr) {
        this.pnr = pnr;
    }


    /**
     * Gets the kon value for this Personuppgifter.
     * 
     * @return kon
     */
    public se.carelink.webservices.npo.KonEnum getKon() {
        return kon;
    }


    /**
     * Sets the kon value for this Personuppgifter.
     * 
     * @param kon
     */
    public void setKon(se.carelink.webservices.npo.KonEnum kon) {
        this.kon = kon;
    }


    /**
     * Gets the f_namn value for this Personuppgifter.
     * 
     * @return f_namn
     */
    public java.lang.String getF_namn() {
        return f_namn;
    }


    /**
     * Sets the f_namn value for this Personuppgifter.
     * 
     * @param f_namn
     */
    public void setF_namn(java.lang.String f_namn) {
        this.f_namn = f_namn;
    }


    /**
     * Gets the e_namn value for this Personuppgifter.
     * 
     * @return e_namn
     */
    public java.lang.String getE_namn() {
        return e_namn;
    }


    /**
     * Sets the e_namn value for this Personuppgifter.
     * 
     * @param e_namn
     */
    public void setE_namn(java.lang.String e_namn) {
        this.e_namn = e_namn;
    }


    /**
     * Gets the m_namn value for this Personuppgifter.
     * 
     * @return m_namn
     */
    public java.lang.String getM_namn() {
        return m_namn;
    }


    /**
     * Sets the m_namn value for this Personuppgifter.
     * 
     * @param m_namn
     */
    public void setM_namn(java.lang.String m_namn) {
        this.m_namn = m_namn;
    }


    /**
     * Gets the t_namn value for this Personuppgifter.
     * 
     * @return t_namn
     */
    public java.lang.String getT_namn() {
        return t_namn;
    }


    /**
     * Sets the t_namn value for this Personuppgifter.
     * 
     * @param t_namn
     */
    public void setT_namn(java.lang.String t_namn) {
        this.t_namn = t_namn;
    }


    /**
     * Gets the lan value for this Personuppgifter.
     * 
     * @return lan
     */
    public java.lang.String getLan() {
        return lan;
    }


    /**
     * Sets the lan value for this Personuppgifter.
     * 
     * @param lan
     */
    public void setLan(java.lang.String lan) {
        this.lan = lan;
    }


    /**
     * Gets the kommun value for this Personuppgifter.
     * 
     * @return kommun
     */
    public java.lang.String getKommun() {
        return kommun;
    }


    /**
     * Sets the kommun value for this Personuppgifter.
     * 
     * @param kommun
     */
    public void setKommun(java.lang.String kommun) {
        this.kommun = kommun;
    }


    /**
     * Gets the forsaml value for this Personuppgifter.
     * 
     * @return forsaml
     */
    public java.lang.String getForsaml() {
        return forsaml;
    }


    /**
     * Sets the forsaml value for this Personuppgifter.
     * 
     * @param forsaml
     */
    public void setForsaml(java.lang.String forsaml) {
        this.forsaml = forsaml;
    }


    /**
     * Gets the utadr value for this Personuppgifter.
     * 
     * @return utadr
     */
    public java.lang.String getUtadr() {
        return utadr;
    }


    /**
     * Sets the utadr value for this Personuppgifter.
     * 
     * @param utadr
     */
    public void setUtadr(java.lang.String utadr) {
        this.utadr = utadr;
    }


    /**
     * Gets the postnr value for this Personuppgifter.
     * 
     * @return postnr
     */
    public java.lang.String getPostnr() {
        return postnr;
    }


    /**
     * Sets the postnr value for this Personuppgifter.
     * 
     * @param postnr
     */
    public void setPostnr(java.lang.String postnr) {
        this.postnr = postnr;
    }


    /**
     * Gets the postort value for this Personuppgifter.
     * 
     * @return postort
     */
    public java.lang.String getPostort() {
        return postort;
    }


    /**
     * Sets the postort value for this Personuppgifter.
     * 
     * @param postort
     */
    public void setPostort(java.lang.String postort) {
        this.postort = postort;
    }


    /**
     * Gets the avreg_datum value for this Personuppgifter.
     * 
     * @return avreg_datum
     */
    public java.lang.String getAvreg_datum() {
        return avreg_datum;
    }


    /**
     * Sets the avreg_datum value for this Personuppgifter.
     * 
     * @param avreg_datum
     */
    public void setAvreg_datum(java.lang.String avreg_datum) {
        this.avreg_datum = avreg_datum;
    }


    /**
     * Gets the avreg_orsak_kod value for this Personuppgifter.
     * 
     * @return avreg_orsak_kod
     */
    public java.lang.String getAvreg_orsak_kod() {
        return avreg_orsak_kod;
    }


    /**
     * Sets the avreg_orsak_kod value for this Personuppgifter.
     * 
     * @param avreg_orsak_kod
     */
    public void setAvreg_orsak_kod(java.lang.String avreg_orsak_kod) {
        this.avreg_orsak_kod = avreg_orsak_kod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Personuppgifter)) return false;
        Personuppgifter other = (Personuppgifter) obj;
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
            ((this.kon==null && other.getKon()==null) || 
             (this.kon!=null &&
              this.kon.equals(other.getKon()))) &&
            ((this.f_namn==null && other.getF_namn()==null) || 
             (this.f_namn!=null &&
              this.f_namn.equals(other.getF_namn()))) &&
            ((this.e_namn==null && other.getE_namn()==null) || 
             (this.e_namn!=null &&
              this.e_namn.equals(other.getE_namn()))) &&
            ((this.m_namn==null && other.getM_namn()==null) || 
             (this.m_namn!=null &&
              this.m_namn.equals(other.getM_namn()))) &&
            ((this.t_namn==null && other.getT_namn()==null) || 
             (this.t_namn!=null &&
              this.t_namn.equals(other.getT_namn()))) &&
            ((this.lan==null && other.getLan()==null) || 
             (this.lan!=null &&
              this.lan.equals(other.getLan()))) &&
            ((this.kommun==null && other.getKommun()==null) || 
             (this.kommun!=null &&
              this.kommun.equals(other.getKommun()))) &&
            ((this.forsaml==null && other.getForsaml()==null) || 
             (this.forsaml!=null &&
              this.forsaml.equals(other.getForsaml()))) &&
            ((this.utadr==null && other.getUtadr()==null) || 
             (this.utadr!=null &&
              this.utadr.equals(other.getUtadr()))) &&
            ((this.postnr==null && other.getPostnr()==null) || 
             (this.postnr!=null &&
              this.postnr.equals(other.getPostnr()))) &&
            ((this.postort==null && other.getPostort()==null) || 
             (this.postort!=null &&
              this.postort.equals(other.getPostort()))) &&
            ((this.avreg_datum==null && other.getAvreg_datum()==null) || 
             (this.avreg_datum!=null &&
              this.avreg_datum.equals(other.getAvreg_datum()))) &&
            ((this.avreg_orsak_kod==null && other.getAvreg_orsak_kod()==null) || 
             (this.avreg_orsak_kod!=null &&
              this.avreg_orsak_kod.equals(other.getAvreg_orsak_kod())));
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
        if (getKon() != null) {
            _hashCode += getKon().hashCode();
        }
        if (getF_namn() != null) {
            _hashCode += getF_namn().hashCode();
        }
        if (getE_namn() != null) {
            _hashCode += getE_namn().hashCode();
        }
        if (getM_namn() != null) {
            _hashCode += getM_namn().hashCode();
        }
        if (getT_namn() != null) {
            _hashCode += getT_namn().hashCode();
        }
        if (getLan() != null) {
            _hashCode += getLan().hashCode();
        }
        if (getKommun() != null) {
            _hashCode += getKommun().hashCode();
        }
        if (getForsaml() != null) {
            _hashCode += getForsaml().hashCode();
        }
        if (getUtadr() != null) {
            _hashCode += getUtadr().hashCode();
        }
        if (getPostnr() != null) {
            _hashCode += getPostnr().hashCode();
        }
        if (getPostort() != null) {
            _hashCode += getPostort().hashCode();
        }
        if (getAvreg_datum() != null) {
            _hashCode += getAvreg_datum().hashCode();
        }
        if (getAvreg_orsak_kod() != null) {
            _hashCode += getAvreg_orsak_kod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Personuppgifter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Personuppgifter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "pnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "kon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "KonEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f_namn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "f_namn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_namn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "e_namn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_namn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "m_namn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t_namn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "t_namn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "lan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kommun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "kommun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forsaml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "forsaml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utadr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "utadr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "postnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "postort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avreg_datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "avreg_datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avreg_orsak_kod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "avreg_orsak_kod"));
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
