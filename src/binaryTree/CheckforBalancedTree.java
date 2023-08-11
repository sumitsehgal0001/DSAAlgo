package binaryTree;

public class CheckforBalancedTree  extends SampleTree{

    boolean isBalance=true;

    int isBalancedTree(Node root)
    {
        // Your code here

        if(root.left==null && root.right==null)
            return 1;

        int left=0,right=0;

        if(root.left!=null)
            left=isBalancedTree(root.left);

        if(root.right!=null)
            right=isBalancedTree(root.right);

        int diff= Math.max(left,right) - Math.min(left,right);

        if(diff>1 &&  isBalance==true)
            isBalance=false;

        if(left<right)
            return right+1;
        else
            return left+1;


    }
    //9 5 5 5 8 5 7 9 6
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
        // Your code here
        if(root==null)
            return true;

        isBalancedTree(root);

        return isBalance;


    }

    public static void main(String[] args) {
        CheckforBalancedTree obj = new CheckforBalancedTree();

        System.out.println(obj.isBalanced(SampleTree.sampleTree));
    }
}
