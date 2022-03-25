package day00_homework.day17;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // Soru 10 )
        // Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        // toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen iki sayi girin : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int toplam =0;
        if (num1>num2){
            for (int i = num2; i <=num1 ; i++) {
                toplam+=i;
            }
        }else {
            for (int i = num2; i >=num1 ; i--) {
                toplam+=i;
            }
        }
        System.out.println(toplam);


    }
}
