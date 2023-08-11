package test;

import java.util.Arrays;
public class Deque
{
    // Initialize your data structure.
    int size;
    int queue[] = null;
    int front;
    int rear;


    public Deque(int n)
    {
        size=n;
        queue = new int[size];
         front=-1;
         rear =-1;

        // Write your code here.
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x)
    {
        // Write your code here.
        if(isFull())
            return false;

        //not full
        if(front==-1){
            front=0;
            rear=0;
        }else if(front-1==-1 ){
            front=size-1;
        }else{
            front--;
        }
        queue[front]=x;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x)
    {

        // Write your code here.
        if(isFull())
            return false;

        //not full
        if(front==-1){
            front=0;
            rear=0;
        }else if(rear+1>=size ){
            rear=0;
        }else{
            rear++;
        }
        queue[rear]=x;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront()
    {
        int element=-1;
        if(isEmpty())
            return element;

        //not full
        if((front==0 && rear==0) && (front==rear)){
            element= queue[front];
            queue[front]=-1;
            front=-1;
            rear=-1;
        }else if(front+1>=size ){
            element= queue[front];
            queue[front]=-1;
            front=0;
        }else{
            element= queue[front];
            queue[front]=-1;
            front++;
        }

        return element;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear()
    {
        // Write your code here.
        int element=-1;
        if(isEmpty())
            return element;

        //not full
        if((front==0 && rear==0) && (front==rear)){
            element= queue[rear];
            queue[rear]=-1;
            front=-1;
            rear=-1;
        }else if(rear-1<0 ){
            element= queue[rear];
            queue[rear]=-1;
            rear=size-1;
        }else{
            element= queue[rear];
            queue[rear]=-1;
            rear--;
        }

        return element;


    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront()
    {
        // Write your code here.
        if(front!=-1)
        return queue[front];

        return -1;
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear()
    {
        // Write your code here.
        if(rear!=-1)
        return queue[rear];

        return -1;
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty()
    {
        // Write your code here.
        if(front==-1)
            return true;

        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull()
    {
        // Write your code here.
        if((front==0 && rear==size-1) || ( rear==(front-1)%(size-1)  )){
            return true;
        }
        return false;
    }

    public void display(){
        System.out.println("front"+ front);
        System.out.println("rear"+ rear);
        System.out.println("quque"+ Arrays.toString(queue));

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<quque>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }

    public static void main(String[] args) {
//        Deque q = new Deque(5);
//        q.pushFront(4);
//        q.pushRear(5);
//        q.display();
//        //q.popFront();
//        q.pushFront(14);
//        q.pushFront(143);
//        q.display();
        int f=0,r=0,s=2;

        if( (f==0 && r==s-1) || (r==(f-1)))
            System.out.println("s"+ -1/2);

    }
}
