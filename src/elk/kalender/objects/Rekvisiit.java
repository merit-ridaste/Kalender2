package elk.kalender.objects;

import elk.kalender.commons.InputAsker;

import java.util.Scanner;

/**
 * Created by meritridaste on 15/12/14.
 */
public class Rekvisiit {
    private int id;
    private String nimi;
    private String kirjeldus;

    public String getNimi() {
        return nimi;
    }

    public String getkirjedlus() {
        return kirjeldus;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }


    public void kysiMinuInfo() {

        nimi = InputAsker.getAsker().askString("Sisesta uue rekvisiidi nimi:");
        kirjeldus = InputAsker.getAsker().askString("Sisesta uue rekvisiidi kirjeldus:");

    }
}
