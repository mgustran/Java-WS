import controlador.ConvertSpeedsSoap;
import modelo.SpeedUnit;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;


/**
 * Created by mgustran on 13/05/2016.
 */

public class ConvertSpeedTest {
    @Test
    public void shouldCheckConvertSpeed() throws MalformedURLException{


        // Publishes the SOAP Web Service
        //Endpoint endpoint = Endpoint.publish("http://localhost:8081/convertSpeed", new ConvertSpeed());
        //assertTrue(endpoint.isPublished());
        //assertEquals("http://schemas.xmlsoap.org/wsdl/soap/http", endpoint.getBinding().getBindingID());

        // Propiedades para el acceso al WS
        URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        String namespaceURI = "http://www.webserviceX.NET/";
        String servicePart = "ConvertSpeeds";
        String portName = "ConvertSpeedsSoap";
        QName serviceQN = new QName(namespaceURI, servicePart);
        QName portQN = new QName(namespaceURI, portName);

        // Instancia del servicio WEB
        Service service = Service.create(wsdlDocumentLocation, serviceQN);

//        Service service = ConvertSpeeds.create(portQN);
//        Service service = ConvertSpeeds.create(serviceQN);

        ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);





        // Invocamos el WS
        Double torna = convertSpeedsSoap.convertSpeed(12.12, SpeedUnit.KNOTS, SpeedUnit.KILOMETERS_PERHOUR);
        Double expected = 22.444;  // Result: 22.44624
        //Boolean check = false;


//        ConvertSpeed convertSpeedInput = new ConvertSpeed();
//        ConvertSpeedResponse result = new ConvertSpeedResponse();
//        convertSpeedInput.setSpeed(12.12);
//        convertSpeedInput.setFromUnit(SpeedUnit.KNOTS);
//        convertSpeedInput.setToUnit(SpeedUnit.KILOMETERS_PERHOUR);
//        System.out.println(result.getConvertSpeedResult());

        //  Imprimimos la respuesta
        System.out.println(torna);

        //convertSpeeds.convertSpeed(12.12,SpeedUnit.LEAGUES_PERDAY,SpeedUnit.KNOTS);

        //System.out.println(ConvertSpeedResponse.getConvertSpeedResult);
        assertEquals("El valor no es el esperado",  expected, torna, 0.01);
        assertNotNull("Este valor no puede ser null", torna);
        assertNotEquals("Este valor no deberia ser 0", 0.0, torna);
        //assertNotEquals("askdghkqe",));


        //assertTrue("Credit card should not be valid", convertSpeeds.convertSpeed( ));

        // Unpublishes the SOAP Web Service
        //endpoint.stop();
        //assertFalse(endpoint.isPublished());
    }
}


