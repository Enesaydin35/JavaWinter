package day00_homework.day7;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        // ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin ilk kenar uzunlugunu giriniz  ve sonra enter'a basiniz: ");
        double kenar1 = scan.nextDouble();

        System.out.println("Lutfen dikdortgenin ikinci kenar uzunlugunu giriniz : ");
        double kenar2 = scan.nextDouble();

        if (kenar1 == kenar2) {
            System.out.println("Bu bir karedir.");
        }
        if (kenar1 != kenar2) {
            System.out.println("Bu bir kare degildir");
        }

    }
}
