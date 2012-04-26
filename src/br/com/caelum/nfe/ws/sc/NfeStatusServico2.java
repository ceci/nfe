
package br.com.caelum.nfe.ws.sc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 *
 */
@WebServiceClient(name = "NfeStatusServico2", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", wsdlLocation = "file:./wsdls/sc/NfeStatusServico2.wsdl")
public class NfeStatusServico2
    extends Service
{

	private static final String WSDL_LOCATION = "file:./wsdls/sc/NfeStatusServico2.wsdl"; // MAC
	private final static URL NFESTATUSSERVICO2_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.com.caelum.nfe.ws.sc.NfeStatusServico2 .class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.com.caelum.nfe.ws.sc.NfeStatusServico2 .class.getResource(".");
            url = new URL( WSDL_LOCATION);
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:./wsdls/sc/NfeStatusServico2.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        NFESTATUSSERVICO2_WSDL_LOCATION = url;
    }

    public NfeStatusServico2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NfeStatusServico2() {
        super(NFESTATUSSERVICO2_WSDL_LOCATION, new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", "NfeStatusServico2"));
    }

    /**
     *
     * @return
     *     returns NfeStatusServico2Soap12
     */
    @WebEndpoint(name = "NfeStatusServico2Soap12")
    public NfeStatusServico2Soap12 getNfeStatusServico2Soap12() {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", "NfeStatusServico2Soap12"), NfeStatusServico2Soap12.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NfeStatusServico2Soap12
     */
    @WebEndpoint(name = "NfeStatusServico2Soap12")
    public NfeStatusServico2Soap12 getNfeStatusServico2Soap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", "NfeStatusServico2Soap12"), NfeStatusServico2Soap12.class, features);
    }

}
