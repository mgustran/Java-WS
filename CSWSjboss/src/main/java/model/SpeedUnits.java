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

    public String getSULabel() {
        return SULabel;
    }

    public SpeedUnit getSUValue() {
        return SUValue;
    }




    public SpeedUnits[] SUnitsList;

    public SpeedUnits[] getSUtestList() {

        SUnitsList = new SpeedUnits[10];
        SUnitsList[0] = new SpeedUnits("centimetersPersecond", SpeedUnit.CENTIMETERS_PERSECOND);
        SUnitsList[1] = new SpeedUnits("metersPersecond", SpeedUnit.METERS_PERSECOND);
        SUnitsList[2] = new SpeedUnits("feetPersecond", SpeedUnit.FEET_PERSECOND);
        SUnitsList[3] = new SpeedUnits("feetPerminute", SpeedUnit.FEET_PERMINUTE);
        SUnitsList[4] = new SpeedUnits("milesPerhour", SpeedUnit.MILES_PERHOUR);
        SUnitsList[5] = new SpeedUnits("kilometersPerhour", SpeedUnit.KILOMETERS_PERHOUR);
        SUnitsList[6] = new SpeedUnits("furlongsPerminute", SpeedUnit.FURLONGS_PERMIN);
        SUnitsList[7] = new SpeedUnits("knots", SpeedUnit.KNOTS);
        SUnitsList[8] = new SpeedUnits("leaguesPerday", SpeedUnit.LEAGUES_PERDAY);
        SUnitsList[9] = new SpeedUnits("Mach", SpeedUnit.MACH);


        return SUnitsList;



}}
