package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm); // 22:10:13.522105100

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi +=i;
        }

        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi); // 22:14:32.707388400

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem " + (nano2-nano1)+" nanosaniyede bitti"); // islem 2359500.0 nanosaniyede bitti

        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000)); // 14:59:49.889287800

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz

    }
}
