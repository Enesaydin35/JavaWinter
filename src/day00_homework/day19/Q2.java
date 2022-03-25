package day00_homework.day19;

public class Q2 {
    public static void main(String[] args) {

        // Soru 2 )
        // ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri

        char baslangic = 'm';

        do {
            System.out.print(baslangic+", ");
            baslangic--;

        } while (baslangic >= 'c');

    }
}
