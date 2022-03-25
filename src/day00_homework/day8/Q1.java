package day00_homework.day8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        // ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz \naralarda enter'a basiniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        if (kenar1 == kenar2) {
            System.out.println("Bu bir karedir");
        } else {
            System.out.println("Bu bir kare degildir");
        }


    }
}
