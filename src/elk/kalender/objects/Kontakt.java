package elk.kalender.objects;

import elk.kalender.commons.InputAsker;

import java.util.Scanner;

/**
 * Created by meritridaste on 15/12/14.
 */
public class Kontakt {
    private long id;
    private String nimi;
    private String email;
    private String telefoniNumber;
    private String firmaNimi;

    public String getNimi() {return nimi;}
    public String getEmail() {return email;}
    public String gettelefoninumber() {return telefoniNumber;}
    public String getFirmaNimi() {return firmaNimi;}

    public void setNimi( String nimi) { this.nimi = nimi;}
    public void setEmail (String email){this.email = email;}
    public void setTelefoniNumber(String telefoniNumber) { this.telefoniNumber = telefoniNumber;}
    public void setFirmaNimi(String firmaNimi) { this.firmaNimi = firmaNimi;}

    public void kysiMinuInfo() {
        Scanner scanner = new Scanner(System.in);

        nimi = InputAsker.getAsker().askString("Sisesta uue kontakti nimi:");
        email = InputAsker.getAsker().askString("Sisesta email:");
        telefoniNumber = InputAsker.getAsker().askString("Sisesta kontaktnumber:");
       firmaNimi = InputAsker.getAsker().askString("Sisesta firma nimi:");

    }
}
