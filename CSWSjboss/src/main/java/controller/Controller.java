package controller;

import model.SpeedUnit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by mgustran on 20/05/2016.
 */

@ManagedBean(name="controller")
@SessionScoped
public class Controller implements Serializable{
    private static final long serialVersionUID = 1L;

    public Double speed;

    public SpeedUnit fromUnitBean;

    public SpeedUnit toUnitBean;

    public Controller (){
    }


    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
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
