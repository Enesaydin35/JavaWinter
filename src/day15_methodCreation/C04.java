package day15_methodCreation;

public class C04 {

    // main method olmadanda bir class olusturulabilir ancak
    // bu class direk calismaz
    // sadece depo gorevi gorur
    // baska class'lardan kullanilabilecek method veya variable'lari barindirir..

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("Kelimedeki harf sayısı : 5");
        System.out.println("Kelimenin tersten yazılışı : " + tersKelime);

    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("Kelimedeki harf sayısı : 4 ");
        System.out.println("Kelimenin tersten yazılışı : " + tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("Kelimedeki harf sayısı : 3");
        System.out.println("Kelimenin tersten yazılışı : " + tersKelime);
    }
}
