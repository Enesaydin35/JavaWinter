package day14_stringManupulation;

public class C03_stringSayiToplama {

    public static void main(String[] args) {
        // String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz
        // String str1 = "$13.99";
        // String str2 = "$10.55";
        // ipucu : Double.parseDouble() methodu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D", ""); // "1399"
        str2 = str2.replaceAll("\\D", ""); // "1055"

        // str1 ve str2 içeriği sayı olan String'lerdir
        // eğer içeriğinin tamamen sayı olduğunu bildiğimiz String varsa
        // parseDouble() veya parseInteger() methodu kullanabiliriz veya valueOf()...
        // ancak primitive data tipleri method'a sahip olmadıklarından Wrapper class kullanmamız lazım

        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);

        double toplam = (sayi1 + sayi2)/100;
        System.out.println("$" + toplam);
    }
}
