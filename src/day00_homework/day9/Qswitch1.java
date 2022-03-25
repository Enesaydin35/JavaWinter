package day00_homework.day9;

import java.util.Scanner;

public class Qswitch1 {
    public static void main(String[] args) {
        // Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanin kacinci gunundesiniz ? ");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz gun ismi girdiniz tekrar deneyin");

        }


    }
}
