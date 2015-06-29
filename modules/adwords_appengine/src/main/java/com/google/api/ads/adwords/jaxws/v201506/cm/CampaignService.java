
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
@WebServiceClient(name = "CampaignService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201506", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201506/CampaignService?wsdl")
public class CampaignService
    extends Service
{

    private final static URL CAMPAIGNSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMPAIGNSERVICE_EXCEPTION;
    private final static QName CAMPAIGNSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201506", "CampaignService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201506/CampaignService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNSERVICE_WSDL_LOCATION = url;
        CAMPAIGNSERVICE_EXCEPTION = e;
    }

    public CampaignService() {
        super(__getWsdlLocation(), CAMPAIGNSERVICE_QNAME);
    }

    public CampaignService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CampaignServiceInterface
     */
    @WebEndpoint(name = "CampaignServiceInterfacePort")
    public CampaignServiceInterface getCampaignServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "CampaignServiceInterfacePort"), CampaignServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CampaignServiceInterface
     */
    @WebEndpoint(name = "CampaignServiceInterfacePort")
    public CampaignServiceInterface getCampaignServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201506", "CampaignServiceInterfacePort"), CampaignServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNSERVICE_EXCEPTION;
        }
        return CAMPAIGNSERVICE_WSDL_LOCATION;
    }

}
