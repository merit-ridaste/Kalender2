package elk.kalender.applet;


import javax.swing.JApplet;

import java.awt.*;

/**
 * Appleti laiendamise klass.
 */
public class AppletFrame extends JApplet {

    private Kalender cal;

    public AppletFrame(Kalender cal){
        this.cal = cal;
    }

    public void paint(Graphics g){
        super.paint(g);
        cal.joonistaMind(g);
    }
}
