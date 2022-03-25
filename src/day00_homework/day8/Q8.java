package day00_homework.day8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        // Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.

        // Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        // 60 – 80.000 arasinda ise “Konusabiliriz”,
        // 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Maas teklifinizi yaziniz ");
        double maas = scan.nextDouble();

        if (maas < 60000) {
            System.out.println("Maalesef Kabul edemem");
        } else if (maas > 80000) {
            System.out.println("Kabul ediyorum");
        } else {
            System.out.println("Konusabiliriz");
        }


    }
}
