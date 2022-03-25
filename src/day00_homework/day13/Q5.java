package day00_homework.day13;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        // Soru 5 Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        // ilk harf buyuk digerleri kucuk olsun

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 harfli bir kelime giriniz : ");
        String kelime = scan.next().toLowerCase();

        String tersStr = "";

        if (kelime.length() != 4) {
            System.out.println("kelime 4 harfli olmali !!!");
        } else {
            tersStr += kelime.substring(3).toUpperCase();
            tersStr += kelime.substring(2, 3);
            tersStr += kelime.substring(1, 2);
            tersStr += kelime.substring(0, 1);

            System.out.println(tersStr);

        }

        // System.out.println(""+str1.charAt(3)+ str1.charAt(2)+ str1.charAt(1)+ str1.charAt(0));
        // Bu da guzel

    }
}
