package session6;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfWeek());
        LocalDate ld2 = LocalDate.of(2022,12,25);
        LocalDate ld3 = LocalDate.parse("2022-11-25");
        System.out.println(ld.plusMonths(1));//Cộng thêm một giờ

        int c = ld.compareTo(ld3);//So sánh
        System.out.println(c);
        long kc = ChronoUnit.DAYS.between(ld,ld3);//Tính khoảng cách 2 thời gian
        System.out.println(kc);

        LocalDateTime t1 = LocalDateTime.now();//Lịch
        System.out.println(t1);
        System.out.println(t1.plusHours(1));//Thêm Giờ
        System.out.println(t1.minusHours(1));//Bớt giờ
        LocalDateTime t2 = LocalDateTime.of(2022,10,27,12,15,22,22);
        LocalDateTime t3 = LocalDateTime.parse("2022-12-27T14:43:21");
    }
}
