package binaryTree;

public class isTreeIdentical extends SampleTree {


    boolean isTreeIdentical(Node root1, Node root2)
    {
        //base case
        if(root1.left==null && root2.left==null && root1.right==null && root2.right==null)
            return true;


        //recursive case
        Boolean left=null,right=null;

        if(root1.left==null && root2.left==null)
            left= true;
        else if( (root1.left==null && root2.left!=null) || (root1.left!=null && root2.left==null) || (root1.left.val != root2.left.val))
            left= false;
        else
            left=isTreeIdentical( root1.left, root2.left);


        if(root1.right==null && root2.right==null)
            right= true;
        else if( (root1.right==null && root2.right!=null) || (root1.right!=null && root2.right==null) || (root1.right.val != root2.right.val))
            left= false;
        else
            right=isTreeIdentical( root1.right, root2.right);



        if((left!=null && left==false) && (right!=null && right==false))
            return false;
        else if (left==null && right!=null)
            return right;
        else
            return left;

    }

    //Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2)
    {
        // Code Here

        if(root1==root2 && root2==null)
            return true;


        if(root1.val==root2.val)
            return isTreeIdentical( root1,  root2);
        else
            return false;

    }

    public static void main(String[] args) {
        isTreeIdentical obj = new isTreeIdentical();

        System.out.println(obj.isIdentical(SampleTree.sampleTree,SampleTree.sampleTree));
    }


}
