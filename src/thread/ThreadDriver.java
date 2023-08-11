package thread;

public class ThreadDriver {

    public static void main(String[] args) {
        Runnable r1= new MyRunnable();
        Runnable r2= new MyRunnable();


        Thread t1 =new Thread(r1,"r1");
        Thread t2 =new Thread(r1,"r2");

        t1.start();
        t2.start();

    }
}
