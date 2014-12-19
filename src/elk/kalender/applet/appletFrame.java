package elk.kalender.applet;


import javax.swing.JApplet;

import java.awt.*;

/**
 * Created by meritridaste on 19/12/14.
 */
public class AppletFrame extends JApplet {

    private Kalender cal;
    private int width;
    private int height;

    public AppletFrame(Kalender cal){
        this.width = width;
        this.height = height;
        this.cal = cal;
    }

    public void paint(Graphics g){
        super.paint(g);

        cal.joonistaMind(g);
    }
}
