package day00_homework.day13;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Soru 6
        // Kullanicidan bir sifre girmesini isteyin
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    -Ilk harf buyuk harf olmali
        //    -Son harf kucuk harf olmali
        //    -Sifre bosluk icermemeli
        //    -Sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();

        if (sifre.charAt(0) >= 'A' && (sifre.charAt(0) <= 'Z')) {
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                if (!sifre.contains(" ")) {
                    if (sifre.length() >= 8) {
                        System.out.println("Sifre basari ile tanimlandi");
                    }else System.out.println("sifre en az 8 karakter olmalidir\nIslem basarisiz,Lutfen yeni bir sifre girin");
                }else System.out.println("sifre bosluk icermek zorunda\nIslem basarisiz,Lutfen yeni bir sifre girin");
            } else System.out.println("sifre kucuk harf ile bitmek zorunda\nIslem basarisiz,Lutfen yeni bir sifre girin");
        } else System.out.println("Sifre buyuk harf ile baslamak zorunda zorunda\nIslem basarisiz,Lutfen yeni bir sifre girin");
    }
}
