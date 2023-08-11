package test;

import java.util.* ;
import java.io.*;
import java.util.* ;
import java.io.*;


	class LinkedListNode<T>
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data)
        {
        	this.data = data;
    	}
	}


public class Solution
{


    public static void print(LinkedListNode<Integer> head){

        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            System.out.println("value print " + temp.data);
            temp=temp.next;

        }

    }
    public static LinkedListNode<Integer> reverseLlist(LinkedListNode<Integer> head){


        //base case
        if(head==null )
            return null;


        //recursive case
        LinkedListNode<Integer> temp=head;
        head=head.next;
        temp.next=null;

        LinkedListNode<Integer> list= reverseLlist(head);
        if(list!=null)
        System.out.println("return list print " + list.data +"> " + list.next);
        else
            System.out.println("return list null " );


        if(list==null){
            System.out.println("in if list  " + list);
            System.out.println("in if temp print " + temp.data +"> " + temp.next);
            return temp;
        }else{
            System.out.println("in else " );
            LinkedListNode<Integer> secondLastElem=list;
            while(secondLastElem.next!=null){
                System.out.println("in else " + secondLastElem.data +"> " + secondLastElem.next.data);
                secondLastElem=secondLastElem.next;
            }

            secondLastElem.next=temp;
            return list;

        }




    }






    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head)
    {

        // Write your code here!
        //System.out.println("head new>>>>>>>>>>>>>>>>");
        if (head==null || head.next==null)
            return head;

        LinkedListNode<Integer> list=		reverseLlist(head);

        return list;
    }

    public static LinkedListNode<Integer> reverseLinkedList2(LinkedListNode<Integer> head)
    {

        // Write your code here!
        //System.out.println("head new>>>>>>>>>>>>>>>>");
        if (head==null || head.next==null)
            return head;

        LinkedListNode<Integer> forward=null;
        LinkedListNode<Integer> prev=null;
        while(head !=null && head.next!=null){
            forward=head.next;

            forward.next=head;

            prev=head;
            head.next=prev;
            head=forward;
            if(head !=null )
                System.out.print("val" + head.next.data);
        }

        return head;
    }
    public static void main(String[] args) {

        LinkedListNode<Integer> head =new LinkedListNode<Integer> (1);
        LinkedListNode<Integer> head1 =new LinkedListNode<Integer> (2);
        LinkedListNode<Integer> head2 =new LinkedListNode<Integer> (3);
        LinkedListNode<Integer> head3 =new LinkedListNode<Integer> (4);
        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        head3.next=null;

        //print(head);
        reverseLinkedList2(head);
        print(head);

    }
}