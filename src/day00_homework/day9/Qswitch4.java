package day00_homework.day9;

import java.util.Scanner;

public class Qswitch4 {
    public static void main(String[] args) {
        // Soru4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        // Kullanici S girerse “Software”
        // D girerse “Developer”
        // E girerse “Engineer”
        // T girerse “In Testing” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 'SDET' kisaltmasindaki harflerden birini yaziniz");
        char letter = scan.next().toUpperCase().charAt(0);

        switch (letter){
            case 'S':
                System.out.println("Software");
                break;
            case 'D' :
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engineer");
                break;
            case 'T' :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("lutfen gecerli bir harf giriniz");
        }

    }
}
