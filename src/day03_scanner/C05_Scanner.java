package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cemberin yari capini giriniz : ");
        double yariCap = scan.nextDouble();

        System.out.println("Girdiginiz yaricap : "+yariCap);
        System.out.println("cemberin cevresi : "+2*3.14*yariCap);
        System.out.println("dairenin alani : "+3.14*yariCap*yariCap);
    }
}
