import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class InstantDateTime {
    public static void main(String args[])
    {
        Instant today=Instant.now();
        System.out.println(today);
        String date="22-07-2006";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate=LocalDate.parse(date,formatter);
        DateTimeFormatter outputDate=DateTimeFormatter.ofPattern("MMM dd yyyy");
        String finalDate=localDate.format(outputDate);
        System.out.println(finalDate);
    }
}
