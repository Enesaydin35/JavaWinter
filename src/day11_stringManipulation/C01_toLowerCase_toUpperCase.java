package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str ="Java Guzeldir";

        // Biz String method'larini arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        //str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir
        // dolayisiyla String'de yapmak istedigimiz tum degisiklikleri once yapip
        // sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); // JAVA GUZELDİR

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr"))); // JAVA GUZELDIR

    }
}
