import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Birthday anya = new Birthday();
        anya.birthday = new Date(87,7,10);
        anya.now = new Date();
        long diffInMillies = Math.abs(anya.now.getTime() - anya.birthday.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
        System.out.println("С датой Date " + anya.birthday);
        System.out.println("Разница в днях между моим днем рождения и текущей датой " + diff);
        System.out.println();

        BirthdayGregorian anyaGr = new BirthdayGregorian();
        anyaGr.birthDayGreg = new GregorianCalendar(1987,7,10);
        System.out.println("С датой GregorianCalendar " + anyaGr.birthDayGreg.getTime());
        System.out.println();

        BirthdayLocDate anyaLocDate = new BirthdayLocDate();
        anyaLocDate.birthDayLocDate = LocalDate.of(1987,8,10);
        anyaLocDate.nowLocDate = LocalDate.now();
        long diffLocDate = ChronoUnit.DAYS.between(anyaLocDate.birthDayLocDate, anyaLocDate.nowLocDate);
        System.out.println("С датой LocalDate " + anyaLocDate.birthDayLocDate);
        System.out.println("Разница в днях между моим днем рождения и текущей датой = " + diffLocDate);
        System.out.println();

        BirthdayLocDT anyaLocDT = new BirthdayLocDT();
        anyaLocDT.birthDayLocDT = LocalDateTime.of(1987,8,10,3,0);
        anyaLocDT.nowLocDT = LocalDateTime.now();
        long diffLocDT = ChronoUnit.YEARS.between(anyaLocDT.birthDayLocDT,anyaLocDT.nowLocDT);
        System.out.println("С датой LocalDateTime " + anyaLocDT.birthDayLocDT);
        System.out.println("Текущая дата " + anyaLocDT.nowLocDT);
        System.out.println("Разница в годах между моим днем рождения и текущей датой = " + diffLocDT);
        System.out.println();

        BirthdayZoned anyaZoned = new BirthdayZoned();
        anyaZoned.birthdayZoned = ZonedDateTime.of(1987,8,10,3,0,0,0, ZoneId.of("Europe/London"));
        anyaZoned.nowZoned = ZonedDateTime.now();
        long diffZoned = ChronoUnit.MONTHS.between(anyaZoned.birthdayZoned,anyaZoned.nowZoned);
        System.out.println("С датой ZonedDataTime " + anyaZoned.birthdayZoned);
        System.out.println("Разница в месяцах " + diffZoned);

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Программа выполнялась, мс: " + elapsed);

        anya.getVremya();
        anyaGr.getVremya();
        anyaLocDT.getVremya();
        anyaLocDT.getVremya();
        anyaZoned.getVremya();

    }
}