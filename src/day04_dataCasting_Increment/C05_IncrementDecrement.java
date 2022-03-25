package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi = 20;
        System.out.println(sayi+10); // 30
        // Bu satirda  sayiyi 10 arttirmadim
        // sayinin 10 fazlasini yazdirdim

        System.out.println(sayi);  // 20
        // eger atama yapmazsak sayida yaptigimiz arttirma yada azaltma kalici olmaz

        sayi = sayi+10;
        System.out.println(sayi); // 30

        System.out.println(sayi=sayi+=10); // 40

        System.out.println(sayi); // 40

        System.out.println(sayi+=10); // 50
        System.out.println(sayi); // 50

        // bir variable'in degerini arrtirmak yada azaltmak isterseniz assignment sarttir !!!

        System.out.println("25. satir : "+sayi++); // 50
        System.out.println("26. satir : "+sayi);   // 51


        System.out.println("29. satir : "+ ++sayi); // 52
        System.out.println("30. satir : "+ sayi);   // 52
    }
}
