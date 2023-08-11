package thread;

public class MyRunnable implements Runnable {

int count=0;
    @Override
    public void run() {


        for(int i=0;i<1_0;i++){
            this.count++;
            System.out.println("count - " + Thread.currentThread().getName()+ " > " + count);
        }
        System.out.println("Final count - " + Thread.currentThread().getName()+ " > " + count);
    }
}
