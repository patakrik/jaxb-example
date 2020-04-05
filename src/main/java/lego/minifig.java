package lego;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlAttribute
    private int count;

    @XmlValue
    private String names;



    public Minifig() {}

    public Minifig(int count, String names) {
        this.count = count;
        this.names = names;
    }

}