import java.util.Date;

public class Birthday {
    long start1 = System.currentTimeMillis();
    Date birthday = new Date();
    Date now = new Date();
    long finish1 = System.currentTimeMillis();
    int one = (int) (finish1-start1);
    public void getVremya(){
        System.out.println(one);
    }
}
