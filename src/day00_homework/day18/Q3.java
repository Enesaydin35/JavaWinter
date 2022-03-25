package day00_homework.day18;

public class Q3 {
    public static void main(String[] args) {

        //Soru 3 )
        // Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        // dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        int bitis = 50;
        int baslangic =23;

        while (baslangic<=bitis){
            if (baslangic%2==0) System.out.print(baslangic+" ");
            baslangic++;
        }
    }
}
