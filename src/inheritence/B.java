package inheritence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

public class B extends  A{


    public  A temp()  { return this;};

    @Override
    public final void print(){ System.out.println("in B");};


    public static void main(String[] args)  {

        String str1 ="abc";
        String str2 ="abc";
        String str3 =new String("abc");
        StringBuffer strb1 =new StringBuffer("abc");
        StringBuilder strbul1 =new StringBuilder("abc");

        System.out.println(str1==str2);                         //true
        System.out.println(str1==str3);                         //false
        System.out.println(str1.equals(str3));                  //true
        System.out.println(str1.toString().equals(str3));       //true
        System.out.println(strb1.equals(str3));                 //false -- as this doesn't override equals of object class, == working
        System.out.println(strb1.toString().equals(str3));      //true
        System.out.println(strbul1.equals(str3));               //false -- as this doesn't override equals of object class, == working
        System.out.println(strbul1.toString().equals(str3));    //true


        try{
            FileInputStream f = new FileInputStream("");
            new B().finalize();

        }catch (Throwable e){


               throw new RuntimeException(e);

        }
    }



}

