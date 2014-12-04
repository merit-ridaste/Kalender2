package elk.kalender;

import elk.kalender.adding.AddSyndmus;
import elk.kalender.objects.Saal;
import elk.kalender.objects.Syndmus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code hereSyste
        Scanner scanner = new Scanner(System.in);

        //kysi kasutajalt mitut saali me tahame lisada
        Saal uusSaal = new Saal();
        //kysime kasutajalt pindala, n2ide kasutajalt info kysimise kohta.
        System.out.println("Sisesta saali pindala: ");
        int sisseLoetudPindala = scanner.nextInt();
        uusSaal.setSyndmused(new ArrayList<Syndmus>()); // loo tyhi list kuhu salvestada syndmused.
        uusSaal.setPindala(sisseLoetudPindala);

        AddSyndmus.addSyndmused(uusSaal, scanner);

        //siin kysin ja prindin v2lja.
        System.out.println(uusSaal.getPindala());
    }
}
