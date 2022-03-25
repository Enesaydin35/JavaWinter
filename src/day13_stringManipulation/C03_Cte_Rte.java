package day13_stringManipulation;

public class C03_Cte_Rte {
    public static void main(String[] args) {

        // int sayi = "Ali can"; // syntax hatalarini Java yazdigimizda gorur ve altini cizer
                                 // tum projede alti cizili bir kod varsa projede hicbir class calismaz
                                 // CTE

        String str = "Javada hersey zamanla oturur";
        System.out.println(str.substring(5000)); // Java burada sinir bilmez ==> RTE
    }
}
