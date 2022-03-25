package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin ve kullanici sifira basincaya kadar devam edin
        // kullanici sıfıra basıncaya kadar girdigi tum sayiların toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int sayi = 1;
        int toplam = 0;

        while (sayi!=0) {

            System.out.println("Lutfen toplamak için bir  sayı alın \nbitirmek için 0'a basın");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Girilen sayiların toplamı : "+ toplam);

        // baslangic ve bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avntajlidir
    }
}
