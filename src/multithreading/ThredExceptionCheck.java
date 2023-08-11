package multithreading;

import java.util.Arrays;

public class ThredExceptionCheck implements Runnable{


    @Override
    public void run()  {

            System.out.println("Run");
            test();
        try {
            testAndNotify();
            synchronized (this){
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public  synchronized void  test(){

    }

    public   void  testAndNotify(){
       // this.notify();
    }

    public static void main(String[] args) {

        ThredExceptionCheck th = new ThredExceptionCheck();
        Thread t1 = new Thread(th,"t1");
        t1.start();
      //  th.testAndNotify();
        Integer i[]={1,7,2};
        Arrays.sort(i);

        System.out.println(Arrays.toString(i));
    }
}
