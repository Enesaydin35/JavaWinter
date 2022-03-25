package day14_stringManupulation;

public class C02_TerstenYazdirma {

    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi ilk harfi buyuk,
        // digerleri kucuk olarak tersten yazdirin.

        String str = "AHme";

        String tersStr = str.substring(3).toUpperCase() +
                str.substring(2, 3).toLowerCase() +
                str.substring(1, 2).toLowerCase() +
                str.substring(0, 1).toLowerCase();

        System.out.println(tersStr);

    }
}
