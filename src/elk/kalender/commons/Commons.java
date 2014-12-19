package elk.kalender.commons;

import java.text.SimpleDateFormat;

/**
 * Üldised abi meetodid
 */
public class Commons {
    /**
     * Kasutajalt saadava kuupäeva formaat.
     * @return - formaat
     */
    public static SimpleDateFormat getDateFormat (){
        return new SimpleDateFormat("yyyy/mm/dd/H/m");
    }

    /**
     * Kalendris kuvatava kuupäeva formaat
     * @return - formaat
     */
    public static SimpleDateFormat getCalendarDateFormat(){
        return new SimpleDateFormat("E H:mm");
    }
}
