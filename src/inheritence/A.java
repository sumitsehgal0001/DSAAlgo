package inheritence;

import java.io.IOException;

public class A   {

    public A() {
       // System.out.println("Constructor of A" + this.toString());
    }
    public  A temp()  {return this;};
    public  void print(){ System.out.println("in A");};

}
