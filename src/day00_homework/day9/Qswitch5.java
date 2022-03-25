package day00_homework.day9;

import java.util.Scanner;

public class Qswitch5 {
    public static void main(String[] args) {
        // Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz : ");
        String day = scan.next().toLowerCase();

        switch (day) {
            case "pazaretesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gecersiz gun");
        }


    }
}
