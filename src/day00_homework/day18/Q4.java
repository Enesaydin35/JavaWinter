package day00_homework.day18;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Soru 4)
        //  Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        //  harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //  yapmadigini farz edin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Baslangic ve bitis harflerini girin\nher giriste enter'a basin : ");
        char harf1 = scan.next().toUpperCase().charAt(0);
        char harf2 = scan.next().toUpperCase().charAt(0);

        while (harf1<=harf2){
            System.out.print(harf1+", ");
            harf1++;
        }
        System.out.println();

    }
}
