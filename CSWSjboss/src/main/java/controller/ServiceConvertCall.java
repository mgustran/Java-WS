package controller;

import model.ServiceManager;
import model.SpeedUnit;

import javax.faces.bean.ManagedBean;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mgustran on 02/06/2016.
 */

@ManagedBean(name = "service")
public class ServiceConvertCall {
    Controller controller = new Controller();


        public Double convertSpeed(Double speed, SpeedUnit fromUnitBean, SpeedUnit toUnitBean) throws MalformedURLException {
            URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
            String namespaceURI = "http://www.webserviceX.NET/";
            String servicePart = "ConvertSpeeds";
            String portName = "ConvertSpeedsSoap";
            QName serviceQN = new QName(namespaceURI, servicePart);
            QName portQN = new QName(namespaceURI, portName);

            Service service = Service.create(wsdlDocumentLocation, serviceQN);
            ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);

            Double outputSpeed = convertSpeedsSoap.convertSpeed(speed, fromUnitBean, toUnitBean);
            System.out.println(outputSpeed);


            return outputSpeed;
    }


}
