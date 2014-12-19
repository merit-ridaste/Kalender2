package elk.kalender.commons;


import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Tegeleb kasutajalt info küsimisega.
 */
public class InputAsker {

    private static InputAsker asker;

    private Scanner scanner;

    private InputAsker(){
    }

    /**
     * haldab InputAskerit kasutades singleton patternit
     * @return Jagab InputAskerit.
     */
    public static InputAsker getAsker(){
        if(asker == null){
            asker = new InputAsker();
            asker.scanner = new Scanner(System.in);
            return asker;
        }else{
            return asker;
        }
    }

    /**
     * Küsib kasutajalt kuupäeva.
     * @param s6num, s6num mida kasutajalae kuvatakse.
     * @return
     */
    public Date askDate(String s6num){
        System.out.print(s6num);
        String sisseloetud_Date = scanner.nextLine();
        try {
            Date date = Commons.getDateFormat().parse(sisseloetud_Date);
            return date;
        }catch(ParseException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * Küsitakse kasutajalt reaalarvu.
     * @param s6num s6num kuvatakse kasutajale
     * @return
     */
    public Integer askNumber(String s6num) {
        System.out.println(s6num);
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            return number;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return askNumber(s6num);
        }

    }

    /**
     * Küsib kasutajalt infot.
     * @param s6num s6num kuvatakse kasutajale.
     * @return
     */
    public String askString (String s6num){
        System.out.println( s6num);
        String input = scanner.nextLine();
        if (input == "") {
            askString(s6num);
        }
        return input;
    }
}
