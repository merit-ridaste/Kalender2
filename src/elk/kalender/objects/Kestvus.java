package elk.kalender.objects;

import elk.kalender.commons.InputAsker;

import java.util.Date;

/**
 * Kirjeldab ühe sündmuse kestvust.
 */
public class Kestvus {
    private Date algus;
    private Date l6pp;

    public Date getL6pp() {
        return l6pp;
    }

    public void setL6pp(Date l6pp) {
        this.l6pp = l6pp;
    }

    public Date getAlgus() {
        return algus;
    }

    public void setAlgus(Date algus) {
        this.algus = algus;
    }

    /**
     * Küsib algus ja lõpptähtaega kasutajalt.
     */
    public void kysiMinuInfo(){
        setAlgus(InputAsker.getAsker().askDate("Sisesta kuupäev ja kellaeg(yyyy/mm/dd/H/m)"));
        setL6pp(InputAsker.getAsker().askDate("Siseta l6pu kuupäev ja kellaeg(yyyy/mm/dd/H/m)"));
    }
}
