package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // Concatenation yapmak icin iki ihtimalimiz var
        // istersek daha once yaptigimiz gibi  +  operatorunu kullanabiliriz
        // veya String class'indan concat method'undan yararlanabiliriz

        String str1 = "Java";
        String str2 = "Candir";

        // Java Candir yazdiralim
        System.out.println(str1+ " " +str2);

        String cumle = str1.concat(str2); // JavaCandir

        cumle = str1.concat(" ").concat(str2);
        System.out.println(cumle);

        // concat icine String degilde sayi veya  boolean deger yazsak ?
        // concat method'u icine String parametre ister
        // String disinda bir data turu yazdiginizda onu String haline getirmelisiniz
        //cumle=str1.concat(5); ===> bu olmaz mesela!!!

        cumle = str1.concat(""+5);  // ====> ama bu olur!!! 5 rakamını Stringe donusturduk cunku!!!
        cumle = str1.concat(true+"");



    }
}
