import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.print(now.getDayOfYear());
    }
}
