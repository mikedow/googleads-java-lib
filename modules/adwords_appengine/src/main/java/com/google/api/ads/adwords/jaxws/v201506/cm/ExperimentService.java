
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ExperimentService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201506/ExperimentService?wsdl")
public class ExperimentService
    extends Service
{

    private final static URL EXPERIMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXPERIMENTSERVICE_EXCEPTION;
    private final static QName EXPERIMENTSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201506", "ExperimentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201506/ExperimentService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXPERIMENTSERVICE_WSDL_LOCATION = url;
        EXPERIMENTSERVICE_EXCEPTION = e;
    }

    public ExperimentService() {
        super(__getWsdlLocation(), EXPERIMENTSERVICE_QNAME);
    }

    public ExperimentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ExperimentServiceInterface
     */
    @WebEndpoint(name = "ExperimentServiceInterfacePort")
    public ExperimentServiceInterface getExperimentServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "ExperimentServiceInterfacePort"), ExperimentServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExperimentServiceInterface
     */
    @WebEndpoint(name = "ExperimentServiceInterfacePort")
    public ExperimentServiceInterface getExperimentServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "ExperimentServiceInterfacePort"), ExperimentServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXPERIMENTSERVICE_EXCEPTION!= null) {
            throw EXPERIMENTSERVICE_EXCEPTION;
        }
        return EXPERIMENTSERVICE_WSDL_LOCATION;
    }

}
