package test;


import abstraction.AbstractCheck;
import abstraction.interface1;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    {
        System.out.println("initialize block of Test");
    }

    static {
       // System.out.println("static block of Test");

    }

    public Test() {
        System.out.println("constructor of Test");
    }

    public void   temp(String str,int i){
        System.out.println("s");

    };

    public static void temp(int i,String str){
        System.out.println("s");

    };

    public static void main(String[] args) {
       // new Test();

        Set str = new TreeSet();
        str.add(0);
        str.add(1);
        str.add(2);

        System.gc();
        System.out.println(str);



    }

}
