package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");
        System.out.println(isimler); // [Aykut, yusuf, ilker, oguzhan]

        isimler.set(1,"seckin");  // yusuf gitti, yerine seckin geldi
        System.out.println(isimler); // [Aykut, seckin, ilker, oguzhan]
        // 1. indexe seckin'i koydu ve listeden kaldirdigi ilker'i alip bize getirdi

        // daha onceden listede var olanlarida listede arsiv gibi tutmak istersek
        List<String> logListesi = new ArrayList<>();

        logListesi.add( isimler.set(2, "cosmos"));
        System.out.println(isimler); // [Aykut, seckin, cosmos, oguzhan]
        System.out.println(logListesi); // [ilker]


    }
}
