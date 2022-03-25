package day27_constructor;

public class ZRunner {
    public static void main(String[] args) {

        Z obj1 = new Z("Emre", "Gulser", 44, true);
        System.out.println(obj1); // isim : Emre, soyisim : Gulser, numara 44

        Z obj2 = new Z("Emre", "Dh", 55);
        System.out.println(obj2); // isim : Emre, soyisim : Dh, numara 55
    }
}
