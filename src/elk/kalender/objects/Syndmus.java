package elk.kalender.objects;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.sql.Time;
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


    public void kysiMinuInfo() throws ParseException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta uue syndmuse nimi:");
        String sisseloetud_nimi = scanner.next();
        nimi = sisseloetud_nimi;

        scanner = new Scanner(System.in);
        System.out.print("Sisesta syndmuse kirjledus: ");
        String sisseloetud_kirjeldus = scanner.next();
        kirjeldus = sisseloetud_kirjeldus;

        System.out.print("Sisesta algus aasta, kuu, kuupäev ja kellaeg ");
        String sisseloetud_Date= scanner.next();
        Date date = Commons.getDateFormat().parse(sisseloetud_Date);
        kestvus.setAlgus(date);

        System.out.print("Sisesta algus aasta, kuu, kuupäev ja kellaeg ");
        sisseloetud_Date= scanner.next();
        date = Commons.getDateFormat().parse(sisseloetud_Date);
        kestvus.setL6pp(date);
    }

    public void joonistaMindASCIIs(){

    }
}
