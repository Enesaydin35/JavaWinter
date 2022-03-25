package day00_homework.day8;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        // Girilen isim gecerli bir gun ise gun
        // isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        // gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz :  ");
        String gunIsmi = scan.nextLine();

        if (gunIsmi.equalsIgnoreCase("pazartesi") || gunIsmi.equalsIgnoreCase("pazar")) {
            System.out.println("Paz");
        } else if (gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
            System.out.println("Cum");
        } else if (gunIsmi.equalsIgnoreCase("sali")) {
            System.out.println("Sal");
        } else if (gunIsmi.equalsIgnoreCase("carsamba")) {
            System.out.println("Car");
        } else if (gunIsmi.equalsIgnoreCase("persembe")) {
            System.out.println("Per");
        } else {
            System.out.println("Gecerli gun ismi giriniz");
        }

    }
}
