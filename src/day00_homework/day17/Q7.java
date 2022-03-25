package day00_homework.day17;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Soru 7 ) Interview Question
        //Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir String giriniz : ");
        String str = scan.nextLine();

        String tersStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);
        }
        System.out.println(tersStr);
    }
}
