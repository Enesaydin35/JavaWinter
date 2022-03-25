package day00_homework.day8;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        // eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
        // Diger durumlarda ekrana “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz \naralarda enter'a basiniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar degil");
        }
    }
}
