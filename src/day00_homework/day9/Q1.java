package day00_homework.day9;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        //Soru1 : Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” ,
        // 100’den kucukse “iki basamakli sayi” degilse “uc basamakli veya daha buyuk sayi” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        String result = sayi > 10 ?
                       (sayi < 100 ? "iki basamakli sayi" : "uc basamakli veya daha buyuk sayi") :
                        "rakam" ;

        System.out.println(result);

    }
}
