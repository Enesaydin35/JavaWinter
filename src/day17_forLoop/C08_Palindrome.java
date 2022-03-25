package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        //Soru 9 ) Interview Question
        // Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        // palindrome olup olmadigini kontrol eden bir method olusturun .

        String input = "Kazak";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {

        String kova = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            kova += input.charAt(i);
        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi : "+kova);

        if (input.equalsIgnoreCase(kova)){
            System.out.println("Girdiginiz kelime palindrome ");
        }else {
            System.out.println("Girdiginiz kelime palindrome degil ");
        }
    }
}
