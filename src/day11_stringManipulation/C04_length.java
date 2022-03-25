package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        // kullanicidan ismini alip bas harfini ve son harfini Buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz ");
        String isim = scan.nextLine();

        System.out.println("ilk harf : "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1 = "";  // Ne kadar paran var ==> Hic ==> yani sifir
        System.out.println(str1.length()); // 0

        String str2 = null;
        //System.out.println(str2.length()); //calistirildiginda hata verir
        System.out.println(str2); // null
        // normalde string'ler "" icine yazilir ama null icin buna gerek yoktur
        // null case sensitive'dir , dolayisiyla NULL veya Null yazilmaz
        // "null" bir deger degildir, sadece hicligi gosteren bir pointer'dir
        // yani bir obje var ama icinde hicbir sey yok

        // non-primitive'lerde heap'te obje oluşunca, stack'de o objenin adresi oluşturulur
        // primitive'lerde ise bir konteynır oluşturulur ve konteynırın içine değer konulur.

        String str3;
        //System.out.println(str3);
        // str3 ile str2 ye deger atanmamistir
        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugunu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3'e bir deger atanmasi olmayinca java altini kırmizi cizer
        // ve bu durum düzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez
    }
}
