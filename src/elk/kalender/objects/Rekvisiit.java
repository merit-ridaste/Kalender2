package elk.kalender.objects;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta uue rekvisiidi nimi: ");
        String sisseloetud_nimi = scanner.next();
        nimi = sisseloetud_nimi;

        System.out.print("Sisesta uue rekvisiidi kirjeldus: ");
        String sisseloetud_kirjeldus = scanner.next();
        kirjeldus = sisseloetud_nimi;

    }
}
