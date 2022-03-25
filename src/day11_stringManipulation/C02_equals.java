package day11_stringManipulation;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali"+" Can";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

        System.out.println("== ile karsilastir : "+(str1==str2)); // true
        System.out.println("equals ile karsilastir : "+str1.equals(str2)); // true

        String str3 = str1+"";
        System.out.println("str3 : " + str3);
        System.out.println("== ile karsilastir : "+(str3==str2)); // false
        System.out.println("equals ile karsilastir : "+str3.equals(str2)); // true

        // "==" String'lerin hem degerlerine hem de adreslerine bakar
        // bu ornekte (str1+"") yazdigimızda concatenation yapildigi icin Java yeni bir obje
        // olusturur ve islemin sonucunu yeni bir objenin icine koyar
        // str3 ve str2 'yi "==" ile karsilastirirsak degerleri ayni fakat adresleri farkli oldugu icin
        // "false" doner
        // equals ile karsilastirinca ise  "true" doner


        // String'de == her zaman dogru sonuc vermez
        // bunun icin emin oldugumuz equals method'unu kullanmayi tercih ederiz

        String str5 ="hasan";
        String str6 ="HASAN";
        System.out.println(str5.equals(str6)); //false
        System.out.println(str5.toUpperCase().equals(str6)); // true



    }
}
