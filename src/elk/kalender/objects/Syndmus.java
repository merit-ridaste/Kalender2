package elk.kalender.objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by meritridaste on 05/12/14.
 */
public class Syndmus {

    private long id;

    private String nimi;

    private ArrayList<Date> ajad;

    public void kysiMinuInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta uue syndmuse nimi: ");
        String sisseloetud_nimi = scanner.next();
        nimi = sisseloetud_nimi;
    }


    public void joonistaMindASCIIs(){

    }
}
