package binaryTree;

public class DiameterOfBinaryTree extends SampleTree {
    int dia=0;

    // Function to return the diameter of a Binary Tree.

    int calculateDiameter(SampleTree.Node root) {
        // Your code here

        if(root.left==null && root.right==null){
            return 1;
        }

        int left=0,right=0;

        if(root.left!=null)
            left=calculateDiameter(root.left);

        if(root.right!=null)
            right=calculateDiameter(root.right);


        dia= Math.max(dia,left+right+1);

        if(left>right)
            return left+1;
        else
            return right+1;
    }

    int diameter(SampleTree.Node root) {
        // Your code here

        if(root==null)
            return 0;

        if(root.left==null && root.right==null){
            return 1;
        }


        calculateDiameter(root);

        return dia;
    }

    public static void main(String[] args) {
        System.out.println( new DiameterOfBinaryTree().diameter(SampleTree.sampleTree));
    }

}
