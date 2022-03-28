package day29_staticKeyword;

public class C01_Static {

    String okulIsmi = "Yildiz Koleji";
    static String okulTelefonu="312355698745";

    public static void staticMethod(){
        System.out.println("statik method calisti");
    }
    public void staticOlmayanMethod(){
        System.out.println("statik olmayan method calisti");

    }
}
