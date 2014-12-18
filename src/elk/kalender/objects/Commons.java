package elk.kalender.objects;

import java.text.SimpleDateFormat;

/**
 * Created by meritridaste on 18/12/14.
 */
public class Commons {
    public static SimpleDateFormat getDateFormat (){
        return new SimpleDateFormat("mm/dd/yyyy/H/m");
    }
}
