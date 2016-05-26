package controller;

import model.SpeedUnit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import java.io.Serializable;

/**
 * Created by mgustran on 24/05/2016.
 */
@ManagedBean(name="FromUnitBean")
@SessionScoped
public class FromUnitBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private SpeedUnit fromUnitBean;

    public SpeedUnit getFromUnit() {
        return fromUnitBean;
    }

    public void setFromUnit(SpeedUnit fromUnitBean) {
        this.fromUnitBean = fromUnitBean;
    }




}