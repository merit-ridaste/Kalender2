package elk.kalender.adding;

import elk.kalender.objects.Saal;
import elk.kalender.objects.Syndmus;

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
            //lisasin mingi kommentaari testimiseks
            selleleSaalile.getSyndmused().add(syndmus);
            //viimase reaga tehakse alati i++
        }
    }
}
