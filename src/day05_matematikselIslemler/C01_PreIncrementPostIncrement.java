package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi = 10;
        // Bu sayiyi 1 arttirmak istersek
        sayi++;
        System.out.println(sayi); // 11

        sayi++;
        System.out.println("pre-incrementten once "+sayi); // 12
        // eger 11. ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        // Java iki islemden once hangisini yapacagini bilmek ister
        // once arttirir sonra yazdirirsak java yeni degeri yazdirir
        // ama once yazdirir sonra arttirirsak , bu durumda eski deger yazdirilir

        System.out.println("pre-increment satirinda "+ ++sayi); // once arttir sonra yazdir => 13
        System.out.println("pre-incrementten sonra "+sayi);  // 13


        System.out.println("post-increment satirinda "+sayi++); // once yazdir sonra arttir => 13
        System.out.println("post-increment satirindan sonra "+sayi); // 14



    }
}
