package day19_doWhileLoop;

public class C05_Scope {
    // 1- bir method icerisinde olustrulan variable'lar sadece olusturulduklari
    //      method'da kullanilabilirler, baska method'larda kullanilammazlar
    // 2- Tum method'larin kullanabilmesini istedigimiz variable'lari
    //      class level'da olustururuz
    //      Class level'da olusturdugumuz variable'i
    //     -- static yaparsak tum  methodlar kullanabilir
    //     -- static olmazsa(instance) o zaman sadece static olmayan method'lar kullanabilir
    // 3- Loop icerisinde olusturulan variable'lar loop icerisinde kullanılabilir
    //     ama loop disinda kullanilamaz

    static String kurs = "Java";
    int level = 10;
    static int sayi4;


    public static void main(String[] args) {

        int sayi =10;
        //isim = "Veli";
        System.out.println(kurs);
        //System.out.println(level);

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopSayi=20;
        }
        //System.out.println(i);
        //loopSayi =30;

        int sayi2;

        sayi4++; // class seviyesinde olusturup deger atamadigim sayi4'u arttirmama ragmen java itiraz etmiyor
        //sayi2++; // ama main method icinde olusturup deger atamadigim sayi2 ye java izin vermiyor
    }

    public static void method1() {
        //sayi = 20;
        String isim="Ali Can";
        System.out.println(kurs);
        //System.out.println(level);
    }

    public void method2(){
        //sayi = 30;
        //isim = "ayse";
        System.out.println(kurs);
        System.out.println(level);
    }
}
