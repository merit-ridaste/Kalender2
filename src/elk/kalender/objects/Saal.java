package elk.kalender.objects;

import elk.kalender.commons.InputAsker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hoiab infot saali kohta.
 */
public class Saal {

    private String nimi;
    private String asukoht;
    private int pindala;
    private int k6rgus;
    private int id;

    private ArrayList<Syndmus> syndmused;
    private ArrayList<Kontakt> kontaktid;


    public String getNimi() {return nimi;}
    public String getAsukoht() {return asukoht;}
    public int getPindala() {return pindala;}
    public int getK6rgus() {return k6rgus;}

    public ArrayList<Syndmus> getSyndmused() {return syndmused;}
    public ArrayList<Kontakt> getKontaktid(){return kontaktid;}

    public void setNimi( String nimi) { this.nimi = nimi;}
    public void setAsukoht(String asukoht){this.asukoht = asukoht;}
    public void setPindala(int pindala) { this.pindala = pindala;}
    public void setK6rgus (int k6rgus) { this.k6rgus = k6rgus;}

    public void setKontaktid(ArrayList<Kontakt>kontaktid) {
        this.kontaktid = kontaktid;
    }
    public void setSyndmused(ArrayList<Syndmus> syndmused) {
        this.syndmused = syndmused;
    }

    /**
     * Küsib kasutajalt saali infot.
     */
    public void kysiMinuInfo()
    {
        nimi = InputAsker.getAsker().askString("Sisesta saali nimi:");
        asukoht = InputAsker.getAsker().askString ("Sisesta Saali aadress");
        pindala = InputAsker.getAsker().askNumber("Sisesta saali pindala");
        k6rgus = InputAsker.getAsker().askNumber("Sisesta saali k6rgus");
    }



}




