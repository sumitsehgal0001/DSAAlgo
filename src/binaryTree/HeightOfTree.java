package binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class HeightOfTree {



    static Node sampleTree= sampleTree();
    static class Node{

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }
    static public Node sampleTree(){
        Node root= new Node(1);
        root.left=new Node(3);  root.right=new Node(5);
        root.left.left=new Node(7); root.left.right=new Node(11); root.right.left=new Node(17);
        root.right.right=null;

        return root;
    }
    public static int heightOfTree(Node root){

        int height=0;
        if(root==null)
            return height;
        Queue<Node> q = new ArrayDeque();
        q.add(root);
        q.add(new Node(-1));
        height++;
        while(q.size()>0){
        Node element = q.poll();

        if(element.val==-1){
            if(q.size()>0){
                q.add(new Node(-1));
                height++;
            }
        }else{

            if(element.left!=null)
                q.add(element.left);

            if(element.right!=null)
                q.add(element.right);

        }


        }
return  height;
    }

    public static int heightOfTreeViaRecursion(Node root){

        if(root.left==null && root.right==null)
            return 1;
        int left=0,right=0;
        if(root.left!=null)
            left=  heightOfTreeViaRecursion(root.left)+1;

        if(root.right!=null)
            right=  heightOfTreeViaRecursion(root.right)+1;

        if(left>right)
            return left;
        else
            return right;


    }

    public static void main(String[] args) {
        System.out.println( " > " + heightOfTree(sampleTree));


        System.out.println( " > " + heightOfTreeViaRecursion(sampleTree));
    }
}
