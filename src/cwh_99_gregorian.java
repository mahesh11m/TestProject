import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_99_gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[245]);
        System.out.println(TimeZone.getAvailableIDs()[245]);
        System.out.println(TimeZone.getAvailableIDs()[247]);
        System.out.println(TimeZone.getAvailableIDs()[248]);
        System.out.println(TimeZone.getAvailableIDs()[249]);
        System.out.println(TimeZone.getAvailableIDs()[250]);
        System.out.println(TimeZone.getAvailableIDs()[245]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
    }
}
