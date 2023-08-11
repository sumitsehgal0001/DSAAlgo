package binaryTree;

import java.util.*;

public class BinaryTreeImplementation {

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
        root.left.left=new Node(7); root.left.right=new Node(11); root.right.left=new Node(17); root.right.right=null;

        return root;
    }

    public Node buildBinaryTree(Node root){

        Scanner sc = new Scanner(System.in);
        if(root==null){
            System.out.println("Enter the root data ");

        }
        else {
            System.out.println("Enter the data  for" + root.val);
        }
        int val =sc.nextInt();
        if(val==-1)
            return null;
        root=new Node(val);


        System.out.println("Enter the data for left child ");
        root.left=buildBinaryTree(root);
        System.out.println("Enter the data for right child ");
        root.right=buildBinaryTree(root);
        return root;

    }

    public void levelOrderTree(Node ln){

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(ln);
        queue.add(new Node(-1));


        while(queue.size()>0){
            Node ele = queue.poll();

            if(ele.val==-1){
                System.out.print(" > Level end");
                System.out.println("");
                if(queue.size()>0)
                    queue.add(new Node(-1));
            }else{
                System.out.print(ele.val +" ");
                if(ele.left!=null)
                queue.add(ele.left);
                if(ele.right!=null)
                queue.add(ele.right);
            }



        }


    }
    public void print(Node ln){

        if(ln==null)
            return;
        while(ln!=null){
            System.out.println("print > "+ln.val);
            Node left=ln.left;
            print(left);
            Node right=ln.right;
            print(right);
            return;
        }


    }
    static public void inorderTraversal(Node node){

        if(node==null)
            return;
            inorderTraversal(node.left);
            System.out.print(node.val +" ");
            inorderTraversal(node.right);


    }

    static public void preorderTraversal(Node node){

        if(node==null)
            return;
        System.out.print(node.val +" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);


    }

    static public void postorderTraversal(Node node){

        if(node==null)
            return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.val +" ");


    }

    public Node buildBinaryTreeByTakingInputsInLevelOrderWay(){
        Queue<Node> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the root data ");
        int val =sc.nextInt();
        if(val==-1)
            return null;
        Node root=new Node(val);
        queue.add(root);
        queue.add(new Node(-1));

        while(queue.size()>0){
            Node node=queue.poll();

            if(node.val==-1){
                System.out.println("Level ended");
//                if(queue.size()>0)
//                    queue.add(new Node(-1));
            }else {

                System.out.println("Enter the data for left child of " + node.val);
                val = sc.nextInt();
                if (val != -1){
                    Node leftroot=new Node(val);
                    node.left=leftroot;
                    queue.add(leftroot);
                }

                System.out.println("Enter the data for right child of " + node.val);
                val = sc.nextInt();
                if (val != -1){
                    Node rightroot=new Node(val);
                    node.right=rightroot;
                    queue.add(rightroot);
                }
                queue.add(new Node(-1));
            }

        }

        return root;

    }

    public static void main(String[] args) {

//       Node ln =new BinaryTreeImplementation().buildBinaryTree(null);
//        /*System.out.println( "val" + ln.val + " > " + ln.left.val + " > " + ln.left.left);
//        System.out.println( "val"+ " > " + ln.right.val + " > " + ln.right.right);*/
//        new BinaryTreeImplementation().print(ln);;
//        new BinaryTreeImplementation().levelOrderTree( sampleTree);
//        new BinaryTreeImplementation().inorderTraversal(sampleTree);
//        System.out.println();
//        new BinaryTreeImplementation().preorderTraversal(sampleTree);
//        System.out.println();
//        new BinaryTreeImplementation().postorderTraversal(sampleTree);

        BinaryTreeImplementation obj=new BinaryTreeImplementation();
        Node ln=  obj.buildBinaryTreeByTakingInputsInLevelOrderWay();
        obj.print(ln);
        new BinaryTreeImplementation().preorderTraversal(ln);
    }
}
