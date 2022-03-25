package day00_homework.day11;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
                  kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

             -Girilen kelime cumlede kullanilmamis.
             -Girilen kelime cumlede 1 kere kullanilmis.
             -Girilen kelime cumlede 1’den fazla kullanilmis.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin sonra enter'a basip bir kelime girin");
        String cumle = scan.nextLine();
        String kelime = scan.next();

        int ilkKelime = cumle.indexOf(kelime);
        int ikinciKelime = cumle.indexOf(kelime, ilkKelime+1);

        if (ilkKelime == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (ikinciKelime==-1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
    }
}
