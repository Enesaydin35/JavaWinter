package day00_homework.day17;

public class Q3 {
    public static void main(String[] args) {

        //Soru 3)
        //100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda
        //yazdirin

        int baslangic = 100;
        int bitis = 50;
        for (int i = baslangic; i >=bitis ; i--) {

            if (i>bitis){
                System.out.print(i + ",");
            }else {
                System.out.print(i);
            }
        }
    }
}
