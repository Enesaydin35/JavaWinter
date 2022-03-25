package day00_homework.day17;

public class Q8 {
    public static void main(String[] args) {
        // Soru 8 ) Interview Question
        // Kullanicidan bir String isteyin ve Stringi tersine ceviren
        // bir method yazin.

        String str = "hatice";
        String result =tersCevirenMethod(str);
        System.out.println(result);

    }

    private static String tersCevirenMethod(String str) {

        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+= str.charAt(i);
        }
        return tersStr;
    }
}
