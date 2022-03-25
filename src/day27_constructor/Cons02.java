package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {

        Cons01 obj1 = new Cons01(); // default constructor devrede
        /* Cons01 class'inda hic constructor olustrumazsak
           Java default constructor'u kullandigindan
           obj1 i uretebiliriz

           Ancak biz parametreli veya parametresiz bir constructor yazdigimizda
           java default constructor'u siler

           Dolaysiyla biz herhangi bir constructor olustrudugumuzda
           daha once baska classlar veya kullanicilarin
           olustrumus olabilecegi objeleri kullanabilmeleri icin
           default constructor'un islevini gerceklestirecek
           parametresiz bir constructor olusturmakta fayda var


        */

        Cons01 obj2 = new Cons01("Java");
    }
}
