package elk.kalender.applet;

import elk.kalender.commons.Commons;
import elk.kalender.objects.Saal;
import elk.kalender.objects.Syndmus;
import org.w3c.dom.css.Counter;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by meritridaste on 19/12/14.
 */
public class Kalender {

    private int width;
    private int height;
    private Saal saal;

    public Kalender(int width, int height, Saal saal){
        this.width = width;
        this.height = height;
        this.saal = saal;
    }

    public void joonistaMind(Graphics g) {
        //g.fillRect(100, 100, 100, 100);
        joonistaTaust(g);
    }
    private void joonistaTaust(Graphics g) {
        Calendar cal =  Calendar.getInstance();

        int counter = 1;
        for(int j =0; j<5; j++) {
            for (int i = 0; i < 7; i++) {
                g.drawRect(100 * i, 100*j, 100, 100);
                if(counter <= 31) {
                    g.drawString(String.valueOf(counter), 100 * i, 100 * (j + 1));
                    for(Syndmus syn : saal.getSyndmused()){
                        cal.setTime(syn.getKestvus().getAlgus());
                        if(cal.get(Calendar.DAY_OF_MONTH) == counter){
                            g.drawString(syn.getNimi(),100 * i + 10, 100 * (j + 1)-60);
                            g.drawString(Commons.getCalendarDateFormat().format(syn.getKestvus().getAlgus()),100 * i + 10, 100 * (j + 1)-45);
                            g.drawString(Commons.getCalendarDateFormat().format(syn.getKestvus().getL6pp()),100 * i + 10, 100 * (j + 1)- 25);
                        }
                    }
                    counter++;

                }
            }
        }
        cal.setTime(saal.getSyndmused().get(0).getKestvus().getAlgus());
        g.drawString("Kuu: " + cal.get(Calendar.MONTH), width/2, height-50);
        g.drawString(saal.getNimi(), width/4, height-50);
    }
}
