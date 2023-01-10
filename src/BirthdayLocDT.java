import java.time.LocalDateTime;

public class BirthdayLocDT {
    long start4 = System.currentTimeMillis();
    LocalDateTime birthDayLocDT;
    LocalDateTime nowLocDT;
    long finish4 = System.currentTimeMillis();
    int four = (int) (finish4-start4);
    public void getVremya(){
        System.out.println(four);
    }
}
