package day20_scope_Arrays;

public class C02_StaticVariables {

    /*  -Instance(object) variable'lar objeye bagimlidir ve her obje farkli degerler alabilir
        ornek olarak ogrenci notlari veya ogretmen branslari diyebiliriz
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

        -Static variable'lar ise Class variable olarak tanimlanir
         ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
         eger static variable'in degeri degistirilirse, herkes icin degisir

     */
    static String okulIsmi ="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {


        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo); // 0
        okulNo=102;
        System.out.println(okulNo); // 102
        System.out.println(okulAcikMi); // false

        staticMethod();

        System.out.println(okulNo); // 200

    }

    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo); //200
    }
}
