package binaryTree;

public class SampleTree {

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
}
