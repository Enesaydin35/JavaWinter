package day00_homework.day13;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        //Soru4 Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz\nisimden sonra enter'a basiniz ");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();

        int uzunlukIsim = isim.length();
        int uzunlukSoyisim = soyisim.length();

        if (uzunlukIsim > uzunlukSoyisim) {
            System.out.println("isim soyisimden daha uzun");
        }else if (uzunlukSoyisim == uzunlukIsim) {
            System.out.println("isim ve soyisim esit uzunlukta");
        }else System.out.println("soyisim isimden daha uzun");


    }
}
