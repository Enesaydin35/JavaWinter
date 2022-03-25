package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        // kullanicinin girdigi bir karakterin, harf olup olmadigini bulalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz ");
        char karakter = scan.next().charAt(0); //char mat. karsilastirmada kullanildigi icin tercih edildi..

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
            System.out.println("Girdiginiz karakter bir harftir");
        }else {
            System.out.println("Girdiginiz karakter harf degil");
        }

    }
}
