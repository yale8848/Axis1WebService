/**
 * MobileCodeWSSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class MobileCodeWSSoapSkeleton implements MobileCodeWSSoap, org.apache.axis.wsdl.Skeleton {
    private MobileCodeWSSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://WebXml.com.cn/", "mobileCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://WebXml.com.cn/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("getMobileCodeInfo", _params, new javax.xml.namespace.QName("http://WebXml.com.cn/", "getMobileCodeInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getMobileCodeInfo"));
        _oper.setSoapAction("http://WebXml.com.cn/getMobileCodeInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMobileCodeInfo") == null) {
            _myOperations.put("getMobileCodeInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMobileCodeInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getDatabaseInfo", _params, new javax.xml.namespace.QName("http://WebXml.com.cn/", "getDatabaseInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://WebXml.com.cn/", "ArrayOfString"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getDatabaseInfo"));
        _oper.setSoapAction("http://WebXml.com.cn/getDatabaseInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDatabaseInfo") == null) {
            _myOperations.put("getDatabaseInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDatabaseInfo")).add(_oper);
    }

    public MobileCodeWSSoapSkeleton() {
        this.impl = new MobileCodeWSSoapImpl();
    }

    public MobileCodeWSSoapSkeleton(MobileCodeWSSoap impl) {
        this.impl = impl;
    }
    public String getMobileCodeInfo(String mobileCode, String userID) throws java.rmi.RemoteException
    {
        String ret = impl.getMobileCodeInfo(mobileCode, userID);
        return ret;
    }

    public String[] getDatabaseInfo() throws java.rmi.RemoteException
    {
        String[] ret = impl.getDatabaseInfo();
        return ret;
    }

}
