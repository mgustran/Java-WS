import controller.ConvertSpeedsSoap;
import model.SpeedUnit;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by mgustran on 13/05/2016.
 */

public class ConvertSpeedTest {
    public ConvertSpeedTest() throws MalformedURLException {
    }

    // Propiedades para el acceso al WS
    URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
    String namespaceURI = "http://www.webserviceX.NET/";
    String servicePart = "ConvertSpeeds";
    String portName = "ConvertSpeedsSoap";
    QName serviceQN = new QName(namespaceURI, servicePart);
    QName portQN = new QName(namespaceURI, portName);

    // Instancia del servicio WEB
    Service service = Service.create(wsdlDocumentLocation, serviceQN);
    ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);

    @Test
    public void shouldCheckConvertSpeed1() {

        // Invocamos el WS
        Double torna = convertSpeedsSoap.convertSpeed(12.12, SpeedUnit.KNOTS, SpeedUnit.KILOMETERS_PERHOUR);
        Double expected = 22.444;  // Result: 22.44624

        //  Imprimimos la respuesta
        System.out.println("T1 -> Resultado de la conversion de nudos  a  km/h : " + torna);
    }


    @Test
    public void shouldCheckConvertSpeed2() {

        // Invocamos el WS
        Double torna = convertSpeedsSoap.convertSpeed(12.12, SpeedUnit.MACH, SpeedUnit.LEAGUES_PERDAY);
        Double expected = 71926.604196;  // Result: 22.44624

        //  Imprimimos la respuesta
        System.out.println("T2 -> Resultado de la conversion de mach's  a  leguas/dia : " + torna);
    }

    @Test
    public void shouldCheckConvertSpeed3() {

        // Invocamos el WS
        Double torna = convertSpeedsSoap.convertSpeed(12.12, SpeedUnit.METERS_PERSECOND, SpeedUnit.MILES_PERHOUR);
        Double expected = 43.63199999999999;  // Result: 22.44624

        //  Imprimimos la respuesta
        System.out.println("T3 -> Resultado de la conversion de m/s  a  miles/h : " + torna);
    }
}