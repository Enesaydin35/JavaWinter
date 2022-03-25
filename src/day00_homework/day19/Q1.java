package day00_homework.day19;

public class Q1 {
    public static void main(String[] args) {

        // Soru 1 )
        // 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.

        int baslangic = 9;
        int bitis = 190;

        do {
            if (baslangic % 7 == 0) {
                System.out.print(baslangic + " ");
            }
            baslangic++;

        } while (baslangic <= bitis);

    }
}
