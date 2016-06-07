
package model;

import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@ManagedBean(name = "SpeedUnit")
@XmlType(name = "SpeedUnit")
@XmlEnum
public enum SpeedUnit {

    @XmlEnumValue("centimetersPersecond")
    CENTIMETERS_PERSECOND("centimetersPersecond"),
    @XmlEnumValue("metersPersecond")
    METERS_PERSECOND("metersPersecond"),
    @XmlEnumValue("feetPersecond")
    FEET_PERSECOND("feetPersecond"),
    @XmlEnumValue("feetPerminute")
    FEET_PERMINUTE("feetPerminute"),
    @XmlEnumValue("milesPerhour")
    MILES_PERHOUR("milesPerhour"),
    @XmlEnumValue("kilometersPerhour")
    KILOMETERS_PERHOUR("kilometersPerhour"),
    @XmlEnumValue("furlongsPermin")
    FURLONGS_PERMIN("furlongsPermin"),
    @XmlEnumValue("knots")
    KNOTS("knots"),
    @XmlEnumValue("leaguesPerday")
    LEAGUES_PERDAY("leaguesPerday"),
    @XmlEnumValue("Mach")
    MACH("Mach");
    private final String value;

    SpeedUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }





}