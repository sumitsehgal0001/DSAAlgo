package multithreading;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


class CallableImpl implements Callable {


    @Override
    public Object call() throws Exception {

        return new Date().getTime();
    }
}
public class WaitMechanismCheck  implements Runnable{

    boolean isWaiting=false;

    @Override
    public synchronized void run() {
        this.notify();
//        String str = Thread.currentThread().getName();
//        System.out.println("Name" +Thread.currentThread().getName());
//        synchronized(this){  if(Thread.currentThread().getName()!= null && Thread.currentThread().getName().equalsIgnoreCase("t2")
//        && isWaiting)
//            notifyObj1();
//        else{
//            System.out.println("else starting " + str);
//
//                try {
//                    System.out.println("wait starting " + str);
//                    isWaiting=true;
//                       this.wait();
//                    System.out.println("after wait" +Thread.currentThread().getName());
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }


    }

    public void notifyObj1(){
        //synchronized(this){
            try {
                System.out.println("i m done now notify other " +Thread.currentThread().getName());
                   this.notify();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
       // }
    }



    public static void main(String[] args) throws Exception{
//        WaitMechanismCheck o1= new WaitMechanismCheck();
//        Thread t1 = new Thread(o1);
//        //Thread t2 = new Thread(o1);
//        t1.setName("t1");
//        t1.start();
//        Thread.sleep(5000);
//        t1.start();

        FutureTask [] tasks = new FutureTask [5];

        for(int i=0;i<5;i++){
            CallableImpl obj = new CallableImpl();
            tasks[i]=new FutureTask(obj);
            Thread thread = new Thread(tasks[i]);

            thread.start();
        }

        System.out.println("results +++++++++++++>>>");
        for(int i=0;i<5;i++){
            System.out.println( "result > " + i + " > " + tasks[0].get());
        }

       // t2.setName("t2");
       // t2.start();
        //o1.notify();
    }

}
