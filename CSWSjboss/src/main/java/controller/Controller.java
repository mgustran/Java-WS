package controller;

import model.SpeedUnit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


import javax.faces.model.SelectItem;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mgustran on 20/05/2016.
 */

@ManagedBean(name="controller")
@SessionScoped
public class Controller implements Serializable{
    private static final long serialVersionUID = 1L;

    @ManagedProperty(value="#{SpeedBean}")
    private SpeedBean speedBean;

    //@ManagedProperty(value="#{outputSpeed}")
    private Double outputSpeed;

    @ManagedProperty(value="#{SU}")
    private SpeedUnit fromUnitBean;

    @ManagedProperty(value="#{SpeedBean}")
    private Double inputSpeed;

    @ManagedProperty(value="#{SU}")
    private SpeedUnit toUnitBean;

    public Controller ( ){ }


    public void convert() throws MalformedURLException {
        URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        String namespaceURI = "http://www.webserviceX.NET/";
        String servicePart = "ConvertSpeeds";
        String portName = "ConvertSpeedsSoap";
        QName serviceQN = new QName(namespaceURI, servicePart);
        QName portQN = new QName(namespaceURI, portName);


        Service service = Service.create(wsdlDocumentLocation, serviceQN);
        ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);


        Double outputSpeed = convertSpeedsSoap.convertSpeed(12.12, SpeedUnit.KNOTS, SpeedUnit.KILOMETERS_PERHOUR);
        Double expected = 22.444;  // Result: 22.44624
    }

    public SelectItem[] getSpeedUnitValues() {
        SelectItem[] listaSpeedUnits = new SelectItem[SpeedUnit.values().length];
        int i = 0;
        for (SpeedUnit su : SpeedUnit.values()) {
            listaSpeedUnits[i++] = new SelectItem(su, su.value());}
        return listaSpeedUnits;
    }

    public SpeedUnit[] getSUnitValues() {
        return SpeedUnit.values();
    }

    public void setSpeed(Double inputSpeed) {
        this.inputSpeed = inputSpeed;
    }

    public Double getOutputSpeed() {
        return outputSpeed;
    }




   public Double getInputSpeed() {
       return inputSpeed;
    }



    public SpeedUnit getFromUn() {
        return fromUnitBean;
    }

//    public void setFromUn(SpeedUnit fromUn) {
//        this.fromUn = fromUn;
//    }

    public SpeedUnit getToUn() {
        return toUnitBean;
    }

    public void setToUn(SpeedUnit toUn) {
        this.toUnitBean = toUnitBean;
    }
}
