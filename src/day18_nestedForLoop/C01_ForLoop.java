package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question
        // Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        // sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        int input = 9;
        int faktoriyel=1;

        System.out.print(input+"!=");
        for (int i = input; i >1; i--) {
            faktoriyel*=i;
            System.out.print(i+ "*");
        }
        System.out.println("1="+faktoriyel);
    }
}


