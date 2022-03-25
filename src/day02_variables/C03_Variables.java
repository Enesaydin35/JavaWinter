package day02_variables;

public class C03_Variables {

    public static void main(String[] args) {

        String ogrenciIsmi = "Melih";

        ogrenciIsmi = "Furkan";

        // Bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        // Ancak declare edilen bir variable tekrar declare edilemez

        // String ogrenciIsmi = "Abdullah";


        String isim, soyisim, dogumYeri;
        isim = "Nihat";
        soyisim = "ozel";
        dogumYeri = "Ankara";

        System.out.println(dogumYeri);
        System.out.println(soyisim);

        String tcNo = "12345678910";
        String hiclik = "";

        // String non-primitive oldugu icin biz sadece data saklamak icin degil
        // extra bazi özellikleri de kullanabiliyoruz
        // Eger tc No, okul no, veya telefon numarası gibi
        // kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        // degerler icinde String kullanilabilir

        String harf = "A";
        char harf2 = 'A';

        // Bu ikisi icinde ayni durum gecerli
        // A harfi icin bir variable'i char olarakta olusturabiliriz Srtring olarakta olusturabiliriz
        // Eger sadece saklayacaksak char kullanılabilir
        // ama String in özelliklerinden istifade edebilmek icin
        // String olarak tanimlamak daha avantajli olabilir

    }
}
