
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
@WebServiceClient(name = "MutateJobService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201506/MutateJobService?wsdl")
public class MutateJobService
    extends Service
{

    private final static URL MUTATEJOBSERVICE_WSDL_LOCATION;
    private final static WebServiceException MUTATEJOBSERVICE_EXCEPTION;
    private final static QName MUTATEJOBSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201506", "MutateJobService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201506/MutateJobService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MUTATEJOBSERVICE_WSDL_LOCATION = url;
        MUTATEJOBSERVICE_EXCEPTION = e;
    }

    public MutateJobService() {
        super(__getWsdlLocation(), MUTATEJOBSERVICE_QNAME);
    }

    public MutateJobService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns MutateJobServiceInterface
     */
    @WebEndpoint(name = "MutateJobServiceInterfacePort")
    public MutateJobServiceInterface getMutateJobServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "MutateJobServiceInterfacePort"), MutateJobServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MutateJobServiceInterface
     */
    @WebEndpoint(name = "MutateJobServiceInterfacePort")
    public MutateJobServiceInterface getMutateJobServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "MutateJobServiceInterfacePort"), MutateJobServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MUTATEJOBSERVICE_EXCEPTION!= null) {
            throw MUTATEJOBSERVICE_EXCEPTION;
        }
        return MUTATEJOBSERVICE_WSDL_LOCATION;
    }

}
