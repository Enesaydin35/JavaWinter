package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-03-31T22:35:24.082570300
        System.out.println(tarihSaat.plusYears(3).plusDays(2).plusDays(10).plusHours(5).plusMinutes(5));
        // 2025-04-13T03:42:52.457945200
    }
}
