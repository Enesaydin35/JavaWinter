package day00_homework.day8;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin,
        //sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        //sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz \nher sayidan sonra enter'a basiniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(sayi1 * sayi2);
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        } else {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }


    }

}
