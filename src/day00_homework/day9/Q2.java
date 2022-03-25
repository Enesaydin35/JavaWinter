package day00_homework.day9;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        //Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
        //consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);


        String result = ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')) ?
                (harf>='a' && harf<='z' ? "kucuk harf" : "buyuk harf") :
                "girdiginiz karakter harf degil";

        System.out.println(result);
    }
}
