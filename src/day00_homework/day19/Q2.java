package day00_homework.day19;

public class Q2 {
    public static void main(String[] args) {

        // Soru 2 )
        // âmâ harfinden baslayarak âcâ harfine kadar tum harfleri

        char baslangic = 'm';

        do {
            System.out.print(baslangic+", ");
            baslangic--;

        } while (baslangic >= 'c');

    }
}
