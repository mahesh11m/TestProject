import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();// this is date
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("y-MMMM-d----E--a");// this is formatter
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_TIME;

        String Mydate=dt.format(df);// creating date string using date and formatter
        System.out.println(Mydate);
    }
}
