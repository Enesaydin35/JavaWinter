package day07_ifElseStatements;

import java.util.Scanner;

public class C05_HaftaninGunleri {

    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //     Ornek:  gun=Pazar output = “Hafta sonu”
        //     gun=Sali output = “Hafta ici”
        //     *** String icin equals method’unu kullanin
        //
        //     pazar veya cumartesi ise ===> haftasonu
        //     pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> haftaici



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini yaziniz");
        String gunIsmi = scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESİ")) {
            System.out.println("girdiğiniz gun haftasonu");
        } else {
            System.out.println("girdiginiz gun haftaici");
        }
    }
}
