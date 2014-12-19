package elk.kalender.adding;

import elk.kalender.commons.InputAsker;
import elk.kalender.objects.Rekvisiit;
import elk.kalender.objects.Saal;
import elk.kalender.objects.Syndmus;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by meritridaste on 05/12/14.
 */
public class AddSyndmus {

    public static void addSyndmused(Saal selleleSaalile, Scanner scanner){
        //siin kysime mitut syndmust tahame lisada
        System.out.println("mitu syndmust?");
        int mitusyndmust = scanner.nextInt();

        for(int i = 0; i < mitusyndmust; i++){
            //see kood siin
            Syndmus syndmus = new Syndmus();
            syndmus.kysiMinuInfo();

            selleleSaalile.getSyndmused().add(syndmus);
            //viimase reaga tehakse alati i++
        }
    }
}
