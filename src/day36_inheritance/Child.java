package day36_inheritance;

public class Child extends Parent{

    Child(){

        System.out.println("Child cons. calisti");
    }
    // tum class'larda biz gormesek bile
    // Java'nin olusturdugu default constructor vardir


    // Extends keyword kullanan class'lardaki
    // Tum CONSTRUCTOR'larin ilk satirinda
    // biz gormesek bile super()
    // constructor call vardir
    // yani parent class'in parametresiz constructor call


    public static void main(String[] args) {

        Child child = new Child();
    }
}
