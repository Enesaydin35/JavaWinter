package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // kullanicidan aldiginiz 4 basamaklı bir sayinin basamaklardaki rakamlar toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir tam sayı giriniz : ");
        int sayi = scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        // birler basamagindaki rakami bulmak icin modulus(%) kullaniriz, sayi%10 bize birler basamagini verir.
        // buldugumuz rakami, her seferinde rakamlar toplamina ekleriz
        // sayi/10 ile de son basamaktan kurtuluyoruz..

        // 1. adim : r=0, rt=0, sayi=7532
        rakam = sayi%10; // 2
        rakamlarToplami+=rakam; // 2
        sayi /=10; // 753

        // 2. adim : r=2, rt=2, sayi=753
        rakam = sayi%10; // 3
        rakamlarToplami+=rakam; // 5
        sayi /=10; // 75

        // 3. adim : r=3, rt=5, sayi=75
        rakam = sayi%10; // 5
        rakamlarToplami+=rakam; // 10
        sayi /=10; // 7

        // 4. adim : r=5, rt=10, sayi=7
        rakam = sayi%10; // 7
        rakamlarToplami+=rakam; // 17
        sayi /=10; // 0


        System.out.println("Girdiginiz sayinin rakamlar toplami : "+rakamlarToplami);
    }
}
