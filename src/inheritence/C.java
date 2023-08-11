package inheritence;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Element{
    int i=0;

    public Element(int i) {
        this.i = i;
    }
}

public class C {


    public void sum(){

    }

    public static void main(String[] args) {
        A a = new A();
        a.temp().print();

        B b = new B();
        b.temp().print();

        Set<Element> t = new HashSet();
        t.add(new Element(20));
        t.add(new Element(2));
        t.add(new Element(10));



                    Iterator i = t.iterator();
                    while(i.hasNext());
        System.out.println(">"+((Element)i.next()).i);
    }
}


















