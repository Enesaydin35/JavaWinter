package day00_homework.day8;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // Soru 2) Kullanicidan bir karakter girmesini isteyin
        // ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz :  ");
        char karakter = scan.next().charAt(0);

        if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
            System.out.println("Bu harf bir karakterdir");

        } else {
            System.out.println("Girdiginiz harf bir karakter degildir");
        }
    }
}
