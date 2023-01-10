import java.time.LocalDate;

public class BirthdayLocDate {
    long start3 = System.currentTimeMillis();
    LocalDate birthDayLocDate;
    LocalDate nowLocDate;
    long finish3 = System.currentTimeMillis();
    int three = (int) (finish3-start3);
    public void getVremya(){
        System.out.println(three);
    }
}
