import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class TemporalAdjustersClass {
    public static void main(String args[]){
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate firstDayOfTheNextMonth=today.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(firstDayOfTheNextMonth);

        LocalDate dateOfNextMonday=today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(dateOfNextMonday);

        LocalDate lastDayOfTheMonth=today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfTheMonth);
    }
}
