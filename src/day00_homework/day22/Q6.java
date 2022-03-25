package day00_homework.day22;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {

        // Soru 6)
        // Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
        // Array olarak yazdiran bir method yaziniz

        int arr[] = {1, 2, 3, 5, 9, 8, 5, 4};
        int silinecekElement = 5;

        elemanlariSil(arr, silinecekElement);
    }

    public static void elemanlariSil(int[] arr, int silinecekElement) {
        int sayac = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == silinecekElement) {
                sayac++;
            }
        }
        int yeniArray[]= new int[arr.length-sayac];
        System.out.println(Arrays.toString(yeniArray));

        int index = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != silinecekElement) {
                yeniArray[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(yeniArray));
    }
}
