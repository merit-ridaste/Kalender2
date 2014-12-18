package elk.kalender.objects;

import elk.kalender.commons.Commons;
import elk.kalender.commons.InputAsker;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by meritridaste on 05/12/14.
 */
public class Syndmus {

    private long id;
    private String nimi;
    private String kirjeldus;
    private Kestvus kestvus;
    private Kontakt kontakt;

    public void kysiMinuInfo() {

        nimi = InputAsker.getAsker().askString("Sisesta uue syndmuse nimi:");
        kirjeldus = InputAsker.getAsker().askString("Sisesta syndmuse kirjledus:");

        kestvus = new Kestvus();
        kestvus.kysiMinuInfo();

        kontakt = new Kontakt();
        kontakt.kysiMinuInfo();
    }

    public void joonistaMindASCIIs(){

    }
}
