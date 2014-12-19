package elk.kalender.commons;

import com.javafx.tools.doclets.internal.toolkit.util.DocFinder;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by meritridaste on 18/12/14.
 */
public class InputAsker {

    private static InputAsker asker;

    private Scanner scanner;

    private InputAsker(){
    }

    public static InputAsker getAsker(){
        if(asker == null){
            asker = new InputAsker();
            asker.scanner = new Scanner(System.in);
            return asker;
        }else{
            return asker;
        }
    }


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

    public String askString (String s6num){
        System.out.println( s6num);
        String input = scanner.nextLine();
        if (input == "") {
            askString(s6num);
        }
        return input;
    }
}
