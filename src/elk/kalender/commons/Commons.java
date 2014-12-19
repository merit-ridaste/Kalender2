package elk.kalender.commons;

import java.text.SimpleDateFormat;

/**
 * Created by meritridaste on 18/12/14.
 */
public class Commons {
    public static SimpleDateFormat getDateFormat (){
        return new SimpleDateFormat("yyyy/mm/dd/H/m");
    }

    public static SimpleDateFormat getCalendarDateFormat(){
        return new SimpleDateFormat("E H:mm");
    }
}
