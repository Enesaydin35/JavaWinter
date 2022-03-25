package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaiciHaftasonu {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
           Ornek:  gun=Pazar output = “Hafta sonu”
                   gun=Sali output = “Hafta ici”

           *** String icin "equals" method’unu kullanin

           pazar veya cumartesi ise ===> haftasonu
           pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> haftaici

           == > String case sensitive dir..
                yani pazar, PAZAR, Pazar hepsi farkli kelimelerdir...
                bu durumda String methodlarindan yardim alabiliriz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase(); //kullanici nasil yazarsa yazsin biz kucuk harfe ceviririz

        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farki sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiğiniz gun haftasonu");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun haftaici");

        }

    }
}
