import java.util.Calendar;
import java.util.TimeZone;

public class cwh_calender_class {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/singapore"));
    //    System.out.println(c.getCalendarType());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

    }
}
