package elk.kalender;

import elk.kalender.adding.AddSyndmus;
import elk.kalender.applet.AppletFrame;
import elk.kalender.applet.Kalender;
import elk.kalender.commons.InputAsker;
import elk.kalender.menu.Menu;
import elk.kalender.objects.Kestvus;
import elk.kalender.objects.Saal;
import elk.kalender.objects.Syndmus;


import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();

    }
}