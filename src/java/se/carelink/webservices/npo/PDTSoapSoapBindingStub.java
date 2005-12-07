/**
 * PDTSoapSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package se.carelink.webservices.npo;

public class PDTSoapSoapBindingStub extends org.apache.axis.client.Stub implements se.carelink.webservices.npo.PDTSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HamtaPersonuppgifter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "pnr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaPersonuppgifterReply"));
        oper.setReturnClass(se.carelink.webservices.npo.HamtaPersonuppgifterReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaPersonuppgifterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HamtaVarddokumentIndex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "patientPnr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentIndexReply"));
        oper.setReturnClass(se.carelink.webservices.npo.HamtaVarddokumentIndexReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentIndexResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HamtaVarddokument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "vd_ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ArrayOfVD_id"), se.carelink.webservices.npo.VD_id[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "VD_id"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentReply"));
        oper.setReturnClass(se.carelink.webservices.npo.HamtaVarddokumentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public PDTSoapSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PDTSoapSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PDTSoapSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ArrayOfKuvert");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.Kuvert[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Kuvert");
            qName2 = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Kuvert");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ArrayOfVD_id");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.VD_id[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "VD_id");
            qName2 = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "VD_id");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaPersonuppgifterReply");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.HamtaPersonuppgifterReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentIndexReply");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.HamtaVarddokumentIndexReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentReply");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.HamtaVarddokumentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HOS_person");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.HOS_person.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ID");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.ID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "KonEnum");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.KonEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Kuvert");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.Kuvert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "NPOMessageReply");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.NPOMessageReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Org_id");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.Org_id.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Organisation");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.Organisation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Pers_id");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.Pers_id.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "Personuppgifter");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.Personuppgifter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "ServiceResult");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.ServiceResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "VD_id");
            cachedSerQNames.add(qName);
            cls = se.carelink.webservices.npo.VD_id.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public se.carelink.webservices.npo.HamtaPersonuppgifterReply hamtaPersonuppgifter(java.lang.String pnr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://carelink.se/webservices/npo/HamtaPersonuppgifter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaPersonuppgifter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pnr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (se.carelink.webservices.npo.HamtaPersonuppgifterReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (se.carelink.webservices.npo.HamtaPersonuppgifterReply) org.apache.axis.utils.JavaUtils.convert(_resp, se.carelink.webservices.npo.HamtaPersonuppgifterReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public se.carelink.webservices.npo.HamtaVarddokumentIndexReply hamtaVarddokumentIndex(java.lang.String patientPnr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://carelink.se/webservices/npo/HamtaVarddokumentIndex");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokumentIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {patientPnr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (se.carelink.webservices.npo.HamtaVarddokumentIndexReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (se.carelink.webservices.npo.HamtaVarddokumentIndexReply) org.apache.axis.utils.JavaUtils.convert(_resp, se.carelink.webservices.npo.HamtaVarddokumentIndexReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public se.carelink.webservices.npo.HamtaVarddokumentReply hamtaVarddokument(se.carelink.webservices.npo.VD_id[] vd_ids) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://carelink.se/webservices/npo/HamtaVarddokument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://carelink.se/webservices/npo", "HamtaVarddokument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vd_ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (se.carelink.webservices.npo.HamtaVarddokumentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (se.carelink.webservices.npo.HamtaVarddokumentReply) org.apache.axis.utils.JavaUtils.convert(_resp, se.carelink.webservices.npo.HamtaVarddokumentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
