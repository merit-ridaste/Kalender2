package elk.kalender.menu;

import elk.kalender.applet.AppletFrame;
import elk.kalender.applet.Kalender;
import elk.kalender.commons.InputAsker;
import elk.kalender.objects.Rekvisiit;
import elk.kalender.objects.Saal;
import elk.kalender.objects.Syndmus;

import javax.swing.*;
import java.util.ArrayList;


/**
 * Menuu tegeleb üldise voo juhtimisega.
 */
public class Menu {

    private Saal saal;

    public Menu(){

    }

    public void showMenu() {
        if (saal == null) {
            addSaal();
        }
        joonista(saal);
        displayChoices();
        waitForInput();
    }

    /**
     *  kuvab valikud
     */


    private void displayChoices(){
        System.out.println("1) lisa uus syndmus. \n 2) l6peta t88.");
    }

    /**
     * küsib kasutajalt valikut
     */

    private void waitForInput(){
        int choice = InputAsker.getAsker().askNumber("mida teha järgmisena? Vali number. ");
        //do the right thing.
        System.out.println("doing the right thing for choice nr: " + choice);

        switch (choice){
            case 1:
                lisaSyndmus();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    /**
     * Lisab saali
     */

    private void addSaal(){
        Saal uusSaal = new Saal();
        uusSaal.setNimi("minuIlusNImi");
        uusSaal.kysiMinuInfo();
        ArrayList<Syndmus> syndmused = new ArrayList<Syndmus>();
        Syndmus syn = new Syndmus();
        syn.setNimi("minunimi");
        syn.setKirjeldus("minukirjeldus");
        syn.kysiMinuInfo();

        kysiRekvisiidid(syn);

        syndmused.add(syn);
        uusSaal.setSyndmused(syndmused);
        saal = uusSaal;
        joonista(uusSaal);
        showMenu();
    }

    /**
     * Joonistab saali plaani.
     * @param saal
     */
    public static void joonista(Saal saal){

        JFrame frame = new JFrame("kalender2");
        frame.setSize(800, 600); //akna suuruse määramine.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Kalender cal = new Kalender(frame.getWidth(), frame.getHeight(), saal);
        AppletFrame appletFrame = new AppletFrame(cal);
        frame.add(appletFrame);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    /**
     * Lisab sündmuse.
     */
    private void lisaSyndmus(){
        Syndmus syndmus = new Syndmus();
        syndmus.kysiMinuInfo();
        kysiRekvisiidid(syndmus);
        saal.getSyndmused().add(syndmus);
        showMenu();
    }

    /**
     * Küsib sündmse jaoks rekvisiite.
     * @param syndmus
     */
    private void kysiRekvisiidid(Syndmus syndmus){
        int rekvArv = InputAsker.getAsker().askNumber("mitut rekvisiiti lubada?");
        for(int i = 0; i < rekvArv; i ++){
            Rekvisiit rekv = new Rekvisiit();
            rekv.kysiMinuInfo();
            if(syndmus.getRekvisiidid() == null){
                syndmus.setRekvisiidid(new ArrayList<Rekvisiit>());
            }
            syndmus.getRekvisiidid().add(rekv);
        }
    }

}

