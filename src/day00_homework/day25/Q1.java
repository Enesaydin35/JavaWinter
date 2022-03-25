package day00_homework.day25;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        // soru 1)
        // Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

        List<String> harfListesi = new ArrayList<>();
        harfListesi.add("A");
        harfListesi.add("C");
        harfListesi.add("E");
        harfListesi.add("F");
        System.out.println(harfListesi);

        // soru 2)
        // indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        // index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        // ArrayList’i ekrana yazdiriniz, list soyle olmali; A, L, C, E, F, B.

        harfListesi.add("B");
        harfListesi.add(1,"L");
        System.out.println(harfListesi);

        // soru 3)
        // set() methodu kullanarak, E’yi D yapiniz.
        // ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.

        harfListesi.set(3,"D");
        System.out.println(harfListesi);


        // soru 4)
        // remove() methodu kullanarak, F’yi siliniz.
        // ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        harfListesi.remove("F");
        System.out.println(harfListesi);

        // soru 5)
        // sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        // ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.

        Collections.sort(harfListesi);
        System.out.println(harfListesi);

        // soru 6)
        // contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
        // olmadigini dogrulayiniz.

        System.out.println(harfListesi.contains("L"));
        System.out.println(harfListesi.contains("M"));

        // soru 7)
        // size() methodu kullanarak, list’in kac eleman oldugunu ekrana yazdiriniz.

        System.out.println(harfListesi.size());

        // soru 8)
        // clear() methodu kullanarak, list’deki tum elemanlari siliniz.
        harfListesi.clear();

        // soru 9)
        // isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz

        System.out.println(harfListesi.isEmpty());






    }
}
