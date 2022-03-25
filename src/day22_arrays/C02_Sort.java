package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        // verilen bir arrayy de en kucuk ve en buyuk degerleri yazdirin

        int arr[] = {3,5,6,1,9,0,45,25,4,9,0};

        // sort methodu olmadan yapalim

        int enkucukSayi=Integer.MAX_VALUE; // arr[0]
        int enbuyukSayi=Integer.MIN_VALUE; // arr[0]


        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<enkucukSayi) {
                enkucukSayi=arr[i];
            }
            if (arr[i]>enbuyukSayi) {
                enbuyukSayi=arr[i];
            }
        }
        System.out.println("Arraydeki en kucuk sayi : "+enkucukSayi);
        System.out.println("Arraydeki en buyuk sayi : "+enbuyukSayi);

        Arrays.sort(arr);
        System.out.println("Arraydeki en kucuk sayi : "+arr[0]);
        System.out.println("Arraydeki en buyuk sayi : "+arr[arr.length - 1]);

    }
}
