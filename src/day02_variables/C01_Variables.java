package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {

        // bir variable olustururken icerisine koyacagimiz datanin alabilecegi degerlere
        // bir data turu secmeliyiz
        // örnegin bir sehrin nufusundan bahsediyorsak
        // variable'imizin data turu String, boolean, char, veya double olamaz
        // geriye kalan tam sayı turlerinden sehrin nufusunu icine alabilecek
        // buyuklukte bir data turu secebiliriz
        // biz genelde kurs boyunca genelde tam sayılar icin int, ondalıklı sayılar icin double kulanacagiz



        System.out.println("Hello World yazdiran Javayi halleder");

        int level = 1;
        System.out.println(level);

        boolean ogrenciMi = true;
        boolean yagisVarmi = false;
        System.out.println(ogrenciMi);

        char ozelSembol = '&';
        char sayi ='2';
        char harf ='K';

        System.out.println(harf);

    }
}
