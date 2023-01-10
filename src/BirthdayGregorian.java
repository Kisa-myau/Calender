import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthdayGregorian {
    long start2 = System.currentTimeMillis();
    Calendar birthDayGreg = new GregorianCalendar();
    long finish2 = System.currentTimeMillis();
    int two = (int) (finish2-start2);
    public void getVremya(){
        System.out.println(two);
    }
}
