package controller;

import model.SpeedUnit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import java.io.Serializable;

/**
 * Created by mgustran on 24/05/2016.
 */
@ManagedBean(name="ToUnitBean")
@SessionScoped
public class ToUnitBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private SpeedUnit toUnitBean;

    public SpeedUnit getToUnit() {
        return toUnitBean;
    }

    public void setToUnit(SpeedUnit toUnitBean) {
        this.toUnitBean = toUnitBean;
    }
    public SelectItem[] getSpeedUnitValues() {
        SelectItem[] listaSpeedUnits = new SelectItem[SpeedUnit.values().length];
        int i = 0;
        for (SpeedUnit g : SpeedUnit.values()) {
            listaSpeedUnits[i++] = new SelectItem(g, g.value());
        }
        return listaSpeedUnits;
    }
}