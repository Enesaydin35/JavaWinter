package day34_deneme;

import day34_accessModifier_encapsulation.C01;

public class DenemeChild extends C01 {

    public static void main(String[] args) {

        System.out.println(halkaAcikSayi); // 15
        halkaAcikSayi=30;
        System.out.println(halkaAcikSayi); // 30

        aileyeOzel=25; // bu class child bir class oldugu icin protected olan aileyeOzel variable'ina
                       // direk ulaşabildim buradan
                       // protected acces modifier'a class'dan, package'dan ve
                       // child classlardan ulasilabilirdi cunku.
    }


}
