package controller; /**         Clase Para usar mas adelante    */


//package controller;
//
//import model.SpeedUnit;
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//
//public class ServiceManager {
//
//        public void service() throws MalformedURLException {
//
//                URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
//                String namespaceURI = "http://www.webserviceX.NET/";
//                String servicePart = "ConvertSpeeds";
//                String portName = "ConvertSpeedsSoap";
//                QName serviceQN = new QName(namespaceURI, servicePart);
//                QName portQN = new QName(namespaceURI, portName);
//
//                // Instancia del servicio WEB
//                Service service = Service.create(wsdlDocumentLocation, serviceQN);
//                ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);
//
//                Double torna = convertSpeedsSoap.convertSpeed(12.12, SpeedUnit.KNOTS, SpeedUnit.KILOMETERS_PERHOUR);
//                Double expected = 22.444;  // Result: 22.44624 */




