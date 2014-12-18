package elk.kalender.objects;

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
    public int gettelefoninumber() {return telefoniNumber;}
    public String getFirmaNimi() {return firmaNimi;}

    public void setNimi( String nimi) { this.nimi = nimi;}
    public void setEmail (String email){this.email = email;}
    public void setTelefoniNumber(int telefoniNumber) { this.telefoniNumber = telefoniNumber;}
    public void setFirmaNimi(String firmaNimi) { this.firmaNimi = firmaNimi;}

    public void kysiMinuInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta kontakti nimi:");
        String sisseloetud_nimi = scanner.next();
        nimi = sisseloetud_nimi;

        System.out.print("Sisesta email:");
        String sisseloetud_email = scanner.next();
        email = sisseloetud_email;

        System.out.print("Sisesta kontaktnumber: ");
        telefoniNumber = scanner.next();

        System.out.print("Sisesta firmanimi: ");
        String sisseloetud_firmanimi = scanner.next();
        nimi = sisseloetud_firmanimi;
    }
}
