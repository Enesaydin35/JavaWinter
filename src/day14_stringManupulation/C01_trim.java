package day14_stringManupulation;

public class C01_trim {
    public static void main(String[] args) {

        String str = "  Siz ne derseniz deyin, Java bildigini okur.    ";

        str.trim();             // assignment yok , onun icin esas String kalici degismez!!!
        System.out.println(str); //   Siz ne derseniz deyin, Java bildigini okur.      bosluklu
        System.out.println(str.length()); // 49


        str = str.trim();  // assignment var esas String kalici degisir!!!
        System.out.println(str); //Siz ne derseniz deyin, Java bildigini okur.
        System.out.println(str.length()); // 43
    }
}
