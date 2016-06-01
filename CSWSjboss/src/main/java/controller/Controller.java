package controller;

import model.ServiceManager;
import model.SpeedUnit;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
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
@RequestScoped
public class Controller implements Serializable{
    private static final long serialVersionUID = 1L;



    //@ManagedProperty(value="#{}")
    private Double outputSpeed;


    private Double speedBean;

    private SpeedUnit fromUnitBean;

    private SpeedUnit toUnitBean;
//    SpeedBean speedBean = new SpeedBean();
//
//    FromUnitBean fromUnitBean = new FromUnitBean();
//    ToUnitBean toUnitBean = new ToUnitBean();
    public Controller (){
    }

//    public Double convertSpeed(SpeedBean speedBean, FromUnitBean fromUnitBean, ToUnitBean toUnitBean){
//        speedBean.setSpeed(12.12);
//        fromUnitBean.setFromUnit(SpeedUnit.KNOTS);
//        toUnitBean.setToUnit(SpeedUnit.KILOMETERS_PERHOUR);
//        System.out.println(speedBean.getSpeed());
//        System.out.println(fromUnitBean.getFromUnit());
//        ServiceManager serviceManager = new ServiceManager();
//        outputSpeed = serviceManager.getService().convertSpeed(speedBean.getSpeed(), fromUnitBean.getFromUnit(), toUnitBean.getToUnit() );
//        System.out.println(outputSpeed);
//        return outputSpeed;

//    }

//    public Double convertSpeedTest() {
//        SpeedBean speedBean = new SpeedBean();
//        FromUnitBean fromUnitBean = new FromUnitBean();
//        ToUnitBean toUnitBean = new ToUnitBean();
//        ServiceManager serviceManager = new ServiceManager();
//
//        speedBean.setSpeed(12.12);
//        fromUnitBean.setFromUnit(SpeedUnit.KNOTS);
//        toUnitBean.setToUnit(SpeedUnit.KILOMETERS_PERHOUR);
//
//
//        Double out = serviceManager.getService().convertSpeed(12.12, SpeedUnit.KNOTS, SpeedUnit.KILOMETERS_PERHOUR);
//        return out;
//
//    }


    public Double serviceInit () throws MalformedURLException {
        URL wsdlDocumentLocation = new URL("http://www.webservicex.net/ConvertSpeed.asmx?WSDL");
        String namespaceURI = "http://www.webserviceX.NET/";
        String servicePart = "ConvertSpeeds";
        String portName = "ConvertSpeedsSoap";
        QName serviceQN = new QName(namespaceURI, servicePart);
        QName portQN = new QName(namespaceURI, portName);

        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        String speed = params.get("speed");
        Double convertedSpeed = Double.parseDouble(speed);

        //FromUnitBean fromUnitBean


        Service service = Service.create(wsdlDocumentLocation, serviceQN);
        ConvertSpeedsSoap convertSpeedsSoap = service.getPort(portQN, ConvertSpeedsSoap.class);


        Double outputSpeed = convertSpeedsSoap.convertSpeed(convertedSpeed, fromUnitBean, toUnitBean);
        Double expected = 22.444;  // Result: 22.44624


        return outputSpeed;
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


    public void setSpeedBean(Double speedBean) {
        this.speedBean = speedBean;
    }

    public Double getOutputSpeed() {
        return outputSpeed;
    }

    public Double getSpeedBean() {
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
