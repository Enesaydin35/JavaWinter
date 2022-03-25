package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol edin
        // ve sonucu yazdiran bir ternary olusturun

        int sayi = 1400;
        String sonuc = sayi >= 100 ? "sayi 3 basamakli veya daha buyuk" : "sayi negatif yada 3 basamaktan kucuk";

        // ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable'a atama yapabiliriz


        System.out.println("girdiginiz sayi analizi : " + sonuc);
    }
}
