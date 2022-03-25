package day00_homework.day18;

public class Q2 {

    public static void main(String[] args) {
        //Soru 2 )
        // For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
        // bolunebilen sayilari yazdirin.

        int bitis = 999;
        int baslangic =100;

        for (int i = baslangic; i <= bitis; i++) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        while (baslangic<=bitis){
            if (baslangic % 15 == 0 && baslangic % 20 == 0 && baslangic % 90 == 0) {
                System.out.print(baslangic+" ");
            }
            baslangic++;
        }
    }
}
