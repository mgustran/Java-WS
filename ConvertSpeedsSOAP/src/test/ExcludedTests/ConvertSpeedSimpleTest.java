import org.junit.Test;

import javax.print.DocFlavor;
import javax.xml.ws.Service;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mgustran on 16/05/2016.
 */






    /**
     * @author Antonio Goncalves
     *         APress Book - Beginning Java EE 7 with Glassfish 4
     *         http://www.apress.com/
     *         http://www.antoniogoncalves.org
     *         --
     */
    public class ConvertSpeedSimpleTest {



        @Test
        public void shouldExecuteSpeedConverter() throws MalformedURLException {

            ConvertSpeeds service = new ConvertSpeeds();

            Double torna = ConvertSpeedsSoap.convertSpeed(12.12, SpeedUnit.KNOTS, SpeedUnit.KILOMETERS_PERHOUR);






            //URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");

            //Service service = Service.create(wsdlDocumentLocation, , ("ConvertSpeeds"));


            System.out.println();
            //assertEquals("Credit card should be valid", convertSpeed2.convertSpeed(convertSpeedRequest.speed, convertSpeedRequest.fromUnit, convertSpeedRequest.toUnit));

            //creditCard.setNumber("12341233");
            //assertFalse("Credit card should not be valid", cardValidator.validate(creditCard));
        }}


