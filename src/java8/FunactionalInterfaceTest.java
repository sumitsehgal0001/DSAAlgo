package java8;

@FunctionalInterface
public interface FunactionalInterfaceTest {

    public String test();

    public boolean equals(Object obj);

    public default void test1(){
        System.out.println();
    }

    public default void test2(){
        System.out.println();
    }

    public static void test3(){
        System.out.println();
    }

    public static void test4(){
        System.out.println();
    }
}
