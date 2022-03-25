package day00_homework.day13;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Soru 7 Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
        // ve asagidaki gibi yazdirin
        // isim-soyisim : M***** B*******
        // kart no : 1234

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen kredi karti numaranizi giriniz");
        String kartNo = scan.nextLine();

        String str1 = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*") +
                " " + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

        String str2 = kartNo.substring(0, 15).replaceAll("\\d", "*")+
                kartNo.substring(kartNo.length() - 4);

        System.out.println("isim-soyisim : " + str1 );
        System.out.println("kart no :  " + str2 );



    }
}
