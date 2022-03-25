package day00_homework.day11;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin,
        // harfin cumlede var olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin sonra enter'a basip bir harf girin");
        String cumle = scan.nextLine();
        String harf = scan.next();

        System.out.println(cumle.indexOf(harf));


    }
}
