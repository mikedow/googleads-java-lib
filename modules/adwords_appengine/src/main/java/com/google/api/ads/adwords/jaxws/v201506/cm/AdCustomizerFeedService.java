
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
@WebServiceClient(name = "AdCustomizerFeedService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201506/AdCustomizerFeedService?wsdl")
public class AdCustomizerFeedService
    extends Service
{

    private final static URL ADCUSTOMIZERFEEDSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADCUSTOMIZERFEEDSERVICE_EXCEPTION;
    private final static QName ADCUSTOMIZERFEEDSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201506", "AdCustomizerFeedService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201506/AdCustomizerFeedService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADCUSTOMIZERFEEDSERVICE_WSDL_LOCATION = url;
        ADCUSTOMIZERFEEDSERVICE_EXCEPTION = e;
    }

    public AdCustomizerFeedService() {
        super(__getWsdlLocation(), ADCUSTOMIZERFEEDSERVICE_QNAME);
    }

    public AdCustomizerFeedService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdCustomizerFeedServiceInterface
     */
    @WebEndpoint(name = "AdCustomizerFeedServiceInterfacePort")
    public AdCustomizerFeedServiceInterface getAdCustomizerFeedServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "AdCustomizerFeedServiceInterfacePort"), AdCustomizerFeedServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdCustomizerFeedServiceInterface
     */
    @WebEndpoint(name = "AdCustomizerFeedServiceInterfacePort")
    public AdCustomizerFeedServiceInterface getAdCustomizerFeedServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "AdCustomizerFeedServiceInterfacePort"), AdCustomizerFeedServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADCUSTOMIZERFEEDSERVICE_EXCEPTION!= null) {
            throw ADCUSTOMIZERFEEDSERVICE_EXCEPTION;
        }
        return ADCUSTOMIZERFEEDSERVICE_WSDL_LOCATION;
    }

}
