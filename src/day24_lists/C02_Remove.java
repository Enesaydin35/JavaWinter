package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");
        System.out.println(isimler); // [Aykut, yusuf, ilker, oguzhan]


        // remove(istenenObject)  method'u istenen  elementi kaldirip bize true/flase doner
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // method!u boolean bir variable'a atayabilirsiniz
        boolean sonuc = isimler.remove("oguzhan"); // true

        // sonucu kullaniciya yazdirmak isterseniz
        // if /else ile istediğiniz degerlendirmeyi yazabilirsiniz
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else {
            System.out.println("istediginiz isim listede olmadigi icin silinemedi");
        }

        System.out.println(isimler); // [Aykut, yusuf, ilker]

        sonuc = isimler.remove("Berk");
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else {
            System.out.println("istediginiz isim listede olmadigi icin silinemedi");
        }

        // remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
        // bize remove edilen elementi doner
        // System.out.println(isimler.remove(1)); // yusufu siler ve
        isimler.remove(1);                  // delil olarak yusuf ismini bize dondurur

        // yazdirsakta yazdirmasakta liste degisti ve 1. indexteki element silindi
        System.out.println(isimler);
    }
}
