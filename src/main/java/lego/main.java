package lego;

import album.Track;
import jaxb.JAXBHelper;
import lego.Lego;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Lego lego = new Lego();
        lego.setNumber(75211);
        lego.setName("Imperial TIE Fighter");
        lego.setTheme("Star Wars");
        lego.setSubtheme("Solo");
        lego.setYear(Year.of(2018));
        lego.setPieces(519);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        lego.setMinifigs(minifigs);
        lego.setWeight(new Weight(0.89,"kg"));

        lego.setTags(List.of("Starfighter", "Stormtrooper", "Star Wars","Solo"));
        lego.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(lego, System.out);

        JAXBHelper.toXML(lego, new FileOutputStream("movie.xml"));
        System.out.println(JAXBHelper.fromXML(Lego.class, new FileInputStream("movie.xml")));
    }

}