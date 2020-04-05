package lego;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Weight {
    @XmlAttribute
    private String unit;

    @XmlValue
    private double weight ;





    public Weight() {}

    public Weight(double weight, String unit) {
        this.unit = unit;
        this.weight = weight;
    }

}