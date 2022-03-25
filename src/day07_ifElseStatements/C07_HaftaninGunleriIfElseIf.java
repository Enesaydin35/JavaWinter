package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {

    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin

        // eger kullanici gun ismin yanlis girerse "Yanlis Giris " yazdirin

        //     Ornek:  gun=Pazar output = “Hafta sonu”
        //     gun=Sali output = “Hafta ici”

        //     *** String icin equals method’unu kullanin

        //     pazar veya cumartesi ise ===> haftasonu yazdirin
        //     pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> haftaici yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();

        // hatali girisleri de yazdirmak icin
        // olasiliklari 3'e cikardim
        // hafta sonu - hafta ici - yanlis giris
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiğiniz gun haftasonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun haftaici");

        } else {
            System.out.println("Yanlis Giris");
        }

        // eger if else if .....statement else ile bitiyorsa
        // olasiliklardan sadece bir tanesi mutlaka calisir
        // Java ilk buldugu true' ya ait sonucu yazdirir
        // ve geri kalan sartlara bakmaz

        // if else if..... cumleleri else ile bitmese de calisir
        // ancak bu durumda sadece bir olasilik calisabilir, VEYA hicbir islem yapilmayabilir

    }
}
