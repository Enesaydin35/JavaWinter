package day00_homework.day8;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        // 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.

        //Kullanicidan bir sifre girmesini isteyin

        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz ");
        char sifre = scan.next().charAt(0);

        if (sifre >= 'A' && sifre <= 'Z') {
            if (sifre == 'A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else if (sifre >= 'a' && sifre <= 'z') {
            if (sifre == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else {
            System.out.println("Gecersiz sifre");
        }
    }
}
