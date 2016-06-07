package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by mgustran on 26/05/2016.
 */
@ManagedBean(name = "SU", eager = true)
@SessionScoped
public  class SpeedUnits {
    public String SULabel;
    public SpeedUnit SUValue;

    public SpeedUnits(String SULabel, SpeedUnit SUValue) {
        this.SULabel = SULabel;
        this.SUValue = SUValue;
    }
    public SpeedUnits(){}

    public SpeedUnit[] getSUnitValues() {
        return SpeedUnit.values();
    }

    public String getSULabel() {
        return SULabel;
    }

    public SpeedUnit getSUValue() {
        return SUValue;
    }










}
