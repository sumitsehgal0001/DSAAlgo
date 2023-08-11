package test;

public class Test1 {

    {
        System.out.println("initialize block of Test1");
    }

    static {
        System.out.println("static block of Test1");

    }


    public  void temp(){

    }
    public Test1() {
        System.out.println("constructor of Test1");
    }

    public static void main(String[] args) {

        Test1 t = new Test1();
    }


}
