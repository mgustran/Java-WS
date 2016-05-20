package controller;

/**
 * Created by mgustran on 20/05/2016.
 */

import model.SpeedUnit;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mgustran on 13/05/2016.
 */

public class mAAIN {

    public static void main(String[] args) {

        URL wsdlDocumentLocation = null;
        try {
            wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String namespaceURI = "http://www.webserviceX.NET/";
        String servicePart = "ConvertSpeeds";
        String portName = "ConvertSpeedsSoap";
        QName serviceQN = new QName(namespaceURI, servicePart);
        QName portQN = new QName(namespaceURI, portName);

        Service service = Service.create(wsdlDocumentLocation, serviceQN);
        ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);

        Double torna = convertSpeedsSoap.convertSpeed(12.12, SpeedUnit.KNOTS, SpeedUnit.KILOMETERS_PERHOUR);

        System.out.println(torna);


    }
}