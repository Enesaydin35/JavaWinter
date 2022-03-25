package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // iki String array olusturunuz
        // ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        // Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String arr1[] = {"Ali", "Ayse", "Can", "Fatma"};
        String arr2[] = {"Can", "Evren", "Emsal", "Fatma"};

        List<String> ortakElemanlar = new ArrayList<>();

        for (String each1 : arr1
              ) {
            for (String each2 : arr2
              )  {
                if (each1.equals(each2)) {
                    ortakElemanlar.add(each1);
                }
            }
        }
        
        if (ortakElemanlar.isEmpty()){
            System.out.println("ortak eleman yok");
        }else{
            System.out.println("iki array deki ortak elemeanlar: "+ortakElemanlar);
        }
    }
}
