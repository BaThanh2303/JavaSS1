package demo7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(2);
        System.out.println(ld2);
        LocalDate ld3 = ld1.plusWeeks(3);
        System.out.println(ld3);
        LocalDate ld4 = ld1.minusDays(3);
        String bth = "2003-03-23";
        LocalDate ld5 = LocalDate.parse(bth);
        System.out.println(ld5.getDayOfWeek());
    }
}
