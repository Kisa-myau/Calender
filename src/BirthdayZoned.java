import java.time.ZonedDateTime;

public class BirthdayZoned {
    long start5 = System.currentTimeMillis();
    ZonedDateTime birthdayZoned;
    ZonedDateTime nowZoned;
    long finish5 = System.currentTimeMillis();
    int five = (int) (finish5-start5);
    public void getVremya(){
        System.out.println(five);
    }
}
