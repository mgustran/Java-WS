package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by mgustran on 24/05/2016.
 */
@ManagedBean(name="SpeedBean")
@SessionScoped
public class SpeedBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double speedBean;

    public Double getSpeed() {
        return speedBean;
    }

    public void setSpeed(Double speedBean) {
        this.speedBean = speedBean;
    }
}
