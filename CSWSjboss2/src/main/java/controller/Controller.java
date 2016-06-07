package controller;

import model.ServiceManager;
import model.SpeedUnit;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.validation.constraints.NotNull;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mgustran on 20/05/2016.
 */

@ManagedBean(name="controller")
@SessionScoped
public class Controller implements Serializable{
    private static final long serialVersionUID = 1L;



    //@ManagedProperty(value="#{}")
    private Double outputSpeed;

    public Double speed;

    private SpeedBean speedBean;

    public SpeedUnit fromUnitBean;

    public SpeedUnit toUnitBean;

    public Controller (){
    }


    public void setterSpeed(){


    }


    public String serviceInit() throws MalformedURLException {
        URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        String namespaceURI = "http://www.webserviceX.NET/";
        String servicePart = "ConvertSpeeds";
        String portName = "ConvertSpeedsSoap";
        QName serviceQN = new QName(namespaceURI, servicePart);
        QName portQN = new QName(namespaceURI, portName);

        //FromUnitBean fromUnitBean


        Service service = Service.create(wsdlDocumentLocation, serviceQN);
        ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);

        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        this.speed = Double.parseDouble( params.get("speed"));

        Double outputSpeed = convertSpeedsSoap.convertSpeed(speed, fromUnitBean, toUnitBean);
        Double expected = 22.444;  // Result: 22.44624


        return "result";
    }

//
//**************************   GETTERS Y SETTERS   ******************************************



    public String getSpeedParam(FacesContext fc){
        return "speed";
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


    public void setSpeedBean(SpeedBean speedBean) {
        this.speedBean = speedBean;
    }

    public Double getOutputSpeed() {
        return outputSpeed;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public SpeedBean getSpeedBean() {
        return speedBean;
    }

    public SpeedUnit getFromUn() {return fromUnitBean;    }

    public void setFromUn(SpeedUnit fromUnitBean) {
        this.fromUnitBean = fromUnitBean;
   }

    public SpeedUnit getToUn() {return toUnitBean;    }

    public void setToUn(SpeedUnit toUnitBean) {
        this.toUnitBean = toUnitBean;
    }
}
