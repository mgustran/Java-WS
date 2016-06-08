
package forSOAP;

import model.SpeedUnit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FromUnit" type="{http://www.webserviceX.NET/}SpeedUnit"/>
 *         &lt;element name="ToUnit" type="{http://www.webserviceX.NET/}SpeedUnit"/>
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
    "speed",
    "fromUnit",
    "toUnit"
})
@XmlRootElement(name = "ConvertSpeed")
public class ConvertSpeed {

    protected double speed;
    @XmlElement(name = "FromUnit", required = true)
    protected SpeedUnit fromUnit;
    @XmlElement(name = "ToUnit", required = true)
    protected SpeedUnit toUnit;




    /**
     * Obtiene el valor de la propiedad speed.
     * 
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Define el valor de la propiedad speed.
     * 
     */
    public void setSpeed(double value) {
        this.speed = value;
    }

    /**
     * Obtiene el valor de la propiedad fromUnit.
     * 
     * @return
     *     possible object is
     *     {@link SpeedUnit }
     *     
     */
    public SpeedUnit getFromUnit() {
        return fromUnit;
    }

    /**
     * Define el valor de la propiedad fromUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedUnit }
     *     
     */
    public void setFromUnit(SpeedUnit value) {
        this.fromUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad toUnit.
     * 
     * @return
     *     possible object is
     *     {@link SpeedUnit }
     *     
     */
    public SpeedUnit getToUnit() {
        return toUnit;
    }

    /**
     * Define el valor de la propiedad toUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedUnit }
     *     
     */
    public void setToUnit(SpeedUnit value) {
        this.toUnit = value;
    }

}
