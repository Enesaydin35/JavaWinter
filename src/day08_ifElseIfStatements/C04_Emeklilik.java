package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        /*
		    cinsiyet ve yaş için kişinin emekli olup olmayacağını yazdıran bir
		   java programı yazınız.
		   Eğer çalışan kişi kadınsa ve 60 yaşından büyük olduğunda emekli olabilir
		   çalışan erkekse ve 65 yaşından büyükse emekli olabilir
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\nKadin icin K  \nErkek icin E harfini giriniz ");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz ");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen girdiginiz degeri kontrol edin");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsiniz \nDaha " + (60 - yas) + "  yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }


        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen girdiginiz degeri kontrol edin");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsiniz \nDaha " + (65 - yas) + "  yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }


        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }
    }
}
