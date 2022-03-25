package day00_homework.day7;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan bir gun alin,
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz :  ");
        String day = scan.next().toLowerCase();

        if (day.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (day.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (day.equals("pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        }

    }
}
