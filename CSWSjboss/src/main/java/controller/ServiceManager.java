package controller;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mgustran on 20/05/2016.
 */
public class ServiceManager {
    public void connectServive() throws MalformedURLException {
        URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        String namespaceURI = "http://www.webserviceX.NET/";
        String servicePart = "ConvertSpeeds";
        String portName = "ConvertSpeedsSoap";
        QName serviceQN = new QName(namespaceURI, servicePart);
        QName portQN = new QName(namespaceURI, portName);

        // Instancia del servicio WEB
        Service service = Service.create(wsdlDocumentLocation, serviceQN);
        ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);
    }
}
