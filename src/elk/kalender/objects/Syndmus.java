package elk.kalender.objects;


import elk.kalender.commons.InputAsker;
import java.util.ArrayList;

/**
 * Kirjeldab toimuvat sündmust.
 */
public class Syndmus {

    private long id;
    private String nimi;
    private String kirjeldus;
    private Kestvus kestvus;
    private Kontakt kontakt;
    private ArrayList<Rekvisiit> rekvisiidid;

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

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public void setKestvus(Kestvus kestvus){
        this.kestvus = kestvus;
    }

    public Kestvus getKestvus(){
        return kestvus;
    }

    public ArrayList<Rekvisiit> getRekvisiidid() {
        return rekvisiidid;
    }

    public void setRekvisiidid(ArrayList<Rekvisiit> rekvisiidid){
        this.rekvisiidid = rekvisiidid;
    }


   /* public void kysiRekvisiidid(){
        if(rekvisiidid == null) {
            rekvisiidid = new ArrayList<Rekvisiit>();
        }
        int mitur = InputAsker.getAsker().askNumber("Mitu rekvisiiti soovid?");
        for (int i=0 ;mitur > i ;i++){
            Rekvisiit rekvisiit = new Rekvisiit();
            rekvisiit.kysiMinuInfo();
            rekvisiidid.add(rekvisiit);
        }

    }*/
}
