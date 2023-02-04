import java.time.LocalDateTime;
import  java.time.LocalDate;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println("LocalDate: " + d01);
        System.out.println("LocalDateTime: " + d02);
        System.out.println("Instant: " + d03);
    }
}