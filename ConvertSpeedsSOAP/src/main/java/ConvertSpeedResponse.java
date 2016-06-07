import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConvertSpeedResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "convertSpeedResult"
})
@XmlRootElement(name = "ConvertSpeedResponse")
public class ConvertSpeedResponse {

    @XmlElement(name = "ConvertSpeedResult")
    protected double convertSpeedResult;

    /**
     * Obtiene el valor de la propiedad convertSpeedResult.
     * 
     */
    public double getConvertSpeedResult() {
        return convertSpeedResult;
    }

    /**
     * Define el valor de la propiedad convertSpeedResult.
     * 
     */
    public void setConvertSpeedResult(double value) {
        this.convertSpeedResult = value;
    }

}
