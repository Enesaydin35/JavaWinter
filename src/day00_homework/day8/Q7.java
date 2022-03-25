package day00_homework.day8;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        //50’den kucukse “D”,
        // 50-60 arasi “C”,
        // 60-80 arasi “B”,
        // 80’nin uzerinde ise “A”

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz ");
        double not = scan.nextDouble();
        if (not > 100 || not < 0) {
            System.out.println("Gecersiz bir not girdiniz");
        } else if (not < 50) {
            System.out.println("D");
        } else if (not <= 60) {
            System.out.println("C");
        } else if (not <= 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
