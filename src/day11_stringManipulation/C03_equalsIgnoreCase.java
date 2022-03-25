package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse cevabini ve "derse katiliminiz alinmistir" yazdirin
        // hayir derse cevabini ve "sonraki derslere bekleriz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz ? \nEvet veya Hayir yaziniz");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabiniz : " + cevap + " derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " sonraki derslere bekleriz");
        }else {
            System.out.println("Lutfen evet yada hayir yaziniz");
        }
    }
}
