package elk.kalender.objects;

import java.util.ArrayList;

/**
 * this class represents a room in the training area.
 */
public class Saal {

    private static boolean kasOnYleujutatud = true;

    private int pindala;
    private int k6rgus;

    private ArrayList<Syndmus> syndmused;

    /**
     * this lets you get the "pindala"
     * @return pindala as integer
     */
    public int getPindala() {
        return pindala;
    }

    /**
     * this lets you set the "pindala"
     * @param pindala pindala as integer.
     */
    public void setPindala(int pindala) {
        this.pindala = pindala;
    }

    /**
     *
     * @return
     */
    public int getK6rgus() {
        return k6rgus;
    }

    public void setK6rgus(int k6rgus) {
        this.k6rgus = k6rgus;
    }

    public ArrayList<Syndmus> getSyndmused() {
        return syndmused;
    }

    public void setSyndmused(ArrayList<Syndmus> syndmused) {
        this.syndmused = syndmused;
    }
}
