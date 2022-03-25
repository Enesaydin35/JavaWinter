package day00_homework.day13;

public class Q1 {
    public static void main(String[] args) {

        // Soru 1
        // String methodlarini kullanarak " Java ogrenmek123 Cok guzel@ " String’ini
        // "Java ogrenmek cok guzel" sekline getirin

        String str = " Java ogrenmek123 Cok guzel@ ";
        str = str.trim();
        str = str.replace("123","").replace("C","c").replace("@","");
        System.out.println(str);





    }
}
