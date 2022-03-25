package day00_homework.day19;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        // Soru 6 )
        //Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar devam
        //istemeyi ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi
        //girildigini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi =0;
        int toplam=0;
        int sayac =0;


        do {
            System.out.print("Toplanmak uzere sayi girin : ");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;


        }while (toplam<500);

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

    }
}
