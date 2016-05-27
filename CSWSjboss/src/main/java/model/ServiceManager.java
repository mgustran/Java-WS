package model;

import controller.ConvertSpeedsSoap;
import controller.FromUnitBean;
import controller.SpeedBean;
import controller.ToUnitBean;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mgustran on 27/05/2016.
 */
public class ServiceManager {
    private ConvertSpeedsSoap convertSpeedsSoap;


    public ConvertSpeedsSoap ServiceInit () throws MalformedURLException {
        URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        String namespaceURI = "http://www.webserviceX.NET/";
        String servicePart = "ConvertSpeeds";
        String portName = "ConvertSpeedsSoap";
        QName serviceQN = new QName(namespaceURI, servicePart);
        QName portQN = new QName(namespaceURI, portName);


        //FromUnitBean fromUnitBean


        Service service = Service.create(wsdlDocumentLocation, serviceQN);
        ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);

        return convertSpeedsSoap;
    }

    public ConvertSpeedsSoap getService () {
        return convertSpeedsSoap;
    }
}
