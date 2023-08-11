package test;

import java.util.*;

public class Test2 {


    static class Node<T>
    {

        int data;
        Node<T> next;
        Node(int data)
        {
            data = data;
            next = null;
        }
    };

    public static void print(Node<Integer> head){

        Node<Integer> temp=head;
        while(temp!=null){
            System.out.println("value print " + temp.data);
            temp=temp.next;

        }

    }
    public static boolean isCircular(Node<Integer> head) {
        // Write your code here.


        boolean isCircular=false;

        if(head==null || head.next==null)
            return true;

        Node<Integer> first=head;
        head=head.next;

        while(head!=null){

            if(first==head)
                return true;

            head=head.next;
            System.out.println( "sss");
        }
        return isCircular;
    }



    public static void main1(String[] args) {

        Node<Integer> head =new Node<Integer> (1);
        Node<Integer> head1 =new Node<Integer> (2);
        Node<Integer> head2 =new Node<Integer> (3);
        Node<Integer> head3 =new Node<Integer> (4);
        Node<Integer> head4 =new Node<Integer> (5);
        Node<Integer> head5 =new Node<Integer> (6);

        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        head5.next=head3;


        //print(head);
       System.out.println( isCircular(head));


    }


    public static void main(String[] args) {
        String str = "4 52 55 100 33 61 77 69 40 13 27 87 95 40 96 71 35 79 68 2 98 3 18 93 53 57 2 81 87 42 66 90 45 20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65 29 42 51 94 1 35 65 25 15 88 57 44 92 28 66 60 37";
        String strArr[]= str.split(" ");
        Map map = new HashMap<Integer, List<Integer>>();

        for(int i=0;i<strArr.length/2;i++){

            //boolean isIndexEven= (i!=0 && i%2==0) ?true:false;
            int parent=Integer.valueOf( strArr[i]);
            int child=Integer.valueOf( strArr[i+1]);
            System.out.println("parent"+parent + " child" + child);
            List<Integer> childList=null;
            if(map.get(parent)==null){
                childList=new ArrayList<>();
                childList.add(child);
            }else {
                childList=(List<Integer>) map.get(parent);
                childList.add(child);

            }
            map.put(parent,childList);
            i++;
        }

        map.forEach( (k,v) -> System.out.println("Key: " + k + ": Value: " + v));

    }
}
