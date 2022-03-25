package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak icin 3 adim takip ediyoruz
        // 1. adim : kendimize bier scanner olusturmak

        Scanner scan = new Scanner(System.in); // esitligin saginda yeni bir scanner olustururlur
                                               // ve olusturulan bu scanner scan variable'ina assign edilir
                                               // scan variable'in ismidir, istedigimiz ismi verebiliriz

        // 2.adim  : Kullanicidan istedigimiz degeri girmesi icin "aciklayici" bir bilgi yazdirin

        System.out.println("Lütfen isminizi giriniz");

        // 3.adim : kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        //String kullaniciIsmi = scan.next(); // SADECE ilk kelimeyi alir(ilk space'e kadar olan bolumu alir)

        String kullaniciIsmi = scan.nextLine(); // Satir sonuna kadar girilen tum degerleri alir

        System.out.println("Kullanicinin girdigi isim : "+kullaniciIsmi);
    }
}
