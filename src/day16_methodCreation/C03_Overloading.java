package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {

        // verilen iki sayiyiy toplayan bir method oluturalim
        int sayi1 = 10;
        int sayi2 = 20;
        ikiSayitopla(sayi1,sayi2);

        // iki double sayinin toplamini yazdiran bir method olustrualim
        double sayi3 =15.2;
        double sayi4 =10.3;
        ikiSayitopla(sayi3 , sayi4);

        // eger variable olusturmadan direk sayilari yazarak method call yaparsak
        ikiSayitopla(15,25); // int toplam verir
        ikiSayitopla(10.1,12.3); // double toplam verir

        // bir integer ile bir double toplamini yazdiran bir method olusturalim
        int sayi5=3;
        double sayi6=3.2;
        ikiSayitopla(sayi5,sayi6);

        // Java'da aynı isimde birden fazla method olurmu ?
        // cevap : EVET

        // Aynı isimde birden fazla method olursa Java hangisini çalıştıracağına nasıl karar verir?
        // cevap : İsmi aynı olan method'larda öncelikle parametre sayısına bakar
        // sonra da parametre sayısı ile arguman sayısı eşit olanlardan
        // arguman data türleri ile parametre data türleri arasında uyuma bakar
        // tamamen uyuşan varsa onu kullanır
        // tamamen uyuşan yoksa kapsayan(auto widening) var mı diye bakar ve onu kullanır
        // birden fazla seçenek olduğunda java her zaman en optimum olanı tercih eder

    }


    private static void ikiSayitopla(int sayi3, double sayi4) {
        System.out.println("bir integer bir double toplami : "+(sayi3+sayi4));
    }

    private static void ikiSayitopla(double sayi3, int sayi4) {
        System.out.println("bir double bir integer toplami : "+(sayi3+sayi4));
    }

    private static void ikiSayitopla(double sayi3, double sayi4) {
        System.out.println("iki double toplami : "+(sayi3+sayi4));
    }

    private static void ikiSayitopla(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : "+(sayi1+sayi2));
    }
}
