package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by mgustran on 24/05/2016.
 */
@Named(value="SpeedBean")
@RequestScoped
public class SpeedBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManagedProperty("#{controller.speedBean}")
    private Double speedBean  ;

    public Double getSpeed() {
        return speedBean;
    }

    public void setSpeed(Double speedBean) {
        this.speedBean = speedBean;
    }
}
