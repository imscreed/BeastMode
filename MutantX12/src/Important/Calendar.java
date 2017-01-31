package Important;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-29.
 */
public class Calendar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        GregorianCalendar cal = new GregorianCalendar();
        cal.set(java.util.Calendar.MONTH, Integer.parseInt(month)-1);
        cal.set(java.util.Calendar.DAY_OF_MONTH, Integer.parseInt(day));
        cal.set(java.util.Calendar.YEAR, Integer.parseInt(year));
        System.out.println(new SimpleDateFormat("EEEEE").format(cal.getTime()).toUpperCase());

    }//end of main
}
