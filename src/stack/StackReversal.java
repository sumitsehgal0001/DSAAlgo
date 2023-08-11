package stack;

import java.util.Stack;

public class StackReversal {

    static void insertAtBottem(Stack<Integer> s, Integer element){

        //base
        if(s.size()==0){
            s.push(element);
            return;
        }

        //recursive
        Integer prevElement=s.pop();
        insertAtBottem(s,element);
        s.push(prevElement);

    }
    static void reverseAStackUsingRecursion(Stack<Integer> s){

        //base case
        if(s.size()==0)
            return;


        //recursive case
        Integer element=s.pop();

        reverseAStackUsingRecursion(s);

        insertAtBottem(s,element);


    }


    static void reverseUsingRecursion(Stack<Integer> s)
    {
        // add your code here
        reverseAStackUsingRecursion(s);
    }


    static void reverseUsingArray(Stack<Integer> s)
    {
        // add your code here

        Integer arr[] = new Integer[s.size()];
        int index=0;
        while(s.size()!=0){
            arr[index++]=s.pop();
        }
        index=0;
        while(index<arr.length){
            s.push(arr[index++]);
        }

    }

    static void printStack(Stack<Integer> s){

        while(s.size()!=0){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);

//        StackReversal.reverseAStackUsingRecursion(st);
//        StackReversal.printStack(st);

        StackReversal.reverseUsingArray(st);
        StackReversal.printStack(st);

    }
}
