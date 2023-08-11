package binaryTree;

public class CountLeafNodes {

    static BinaryTreeNode sampleTree= sampleTree();
    static public BinaryTreeNode sampleTree(){
        BinaryTreeNode root= new BinaryTreeNode(1);
        root.left=new BinaryTreeNode(3);  root.right=new BinaryTreeNode(5);
        root.left.left=new BinaryTreeNode(7); root.left.right=new BinaryTreeNode(11); root.right.left=new BinaryTreeNode(17);root.right.right=null;

        return root;
    }
   static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    static  int count=0;


    public static void count(BinaryTreeNode<Integer> root) {
        BinaryTreeNode<Integer> current =root;


        BinaryTreeNode<Integer> left=  current.left;

        if(left!=null && left.data!=-1){
            count( left);
        }
        BinaryTreeNode<Integer> right=  current.right;
        if(right!=null && right.data!=-1){
            count(right);
        }

        if( (left==null || left.data==-1) && (right==null ||right.data==-1))
            count++;


    }

    public static int countWithReturn(BinaryTreeNode<Integer> root) {

        if(root.left==null && root.right==null){
            return 1;
        }
        int left=0,right=0;

        if(root.left!=null)
            left=countWithReturn( root.left);

        if(root.right!=null)
            right=countWithReturn( root.right);

        return left+right;


    }

    public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
        // Write your code here.


        /* method 1
        count=0;
         count(root);
        return count;*/
        if(root==null)
            return 0;

        return countWithReturn(root);


    }


    public static void main(String[] args) {
        System.out.println(" >" + noOfLeafNodes(sampleTree));
    }
}
