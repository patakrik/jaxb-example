package lego;

import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.List;

import album.Track;
import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces","tags","minifigs","weight","url"})
@Data
public class Lego {
    @XmlAttribute
    private int number;

    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;


    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    //@XmlElement(name ="weight")
    private Weight weight;
    private URL url;



    public String getName() {
        return name;
    }
}