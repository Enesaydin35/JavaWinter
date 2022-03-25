package day00_homework.day9;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
        // girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin uzunlugunu giriniz");
        double uzunluk = scan.nextDouble();

        System.out.println("Lutfen dikdortgenin genisligini giriniz");
        double genislik = scan.nextDouble();

        System.out.println(uzunluk == genislik ? "kare" : "kare degil");
    }
}
