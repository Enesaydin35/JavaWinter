package day00_homework.day19;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        // Soru 3)
        // Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini
        // soyleyin.
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin
        // toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);

        int toplam=0;
        int sayi=0;
        int sayac=0;

        do {
            System.out.println("toplamak uzere pozitif sayilar girin\nislemi bitirmek icin 0’a basiniz : ");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }while (sayi!=0);
        System.out.println("Girdiginiz pozitif sayilarin sayisi : "+sayac);
        System.out.println("Girdiginiz pozitif sayilarin toıplami : "+toplam);

    }
}
