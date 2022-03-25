package day00_homework.day17;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question
        // Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        // palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir String ifade girin : ");
        String str = scan.nextLine();

        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }
        if (str.equals(tersStr)){
            System.out.println("palindrome");
        }else System.out.println("palindrome degil");

    }
}
