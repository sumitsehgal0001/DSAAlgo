package binaryTree;

public class isSumTree extends  SampleTree{


    boolean isSumEqual=true;

    int isSumTreeOrNot(Node root){

        if(root.left==null && root.right==null)
            return root.val;

        int left=0,right=0;
        if(root.left!=null)
            left= isSumTreeOrNot(root.left);

        if(root.right!=null)
            right= isSumTreeOrNot(root.right);

        if(isSumEqual==true && root.val!=left+right )
            isSumEqual=false;

        return left+right+root.val;


    }

    Object[] isSumTreeOrNotWitArray2(Node root){

        //base case leaf node
        if(root==null)
        {
            Object[] obj = new Object[]{true,0};
            return obj;
        }

        if(root.left==null && root.right==null)
        {
            Object[] obj = new Object[]{true,root.val};
            return obj;
        }
        Object[] left=null,right=null ;

        left= isSumTreeOrNotWitArray2(root.left);


        right= isSumTreeOrNotWitArray2(root.right);

        int leftHeight=     left==null?0:(int)left[1];
        int rightHeight=    right==null?0:(int)right[1];

        boolean isBalancedLeft = left==null?false:(boolean)left[0];
        boolean isBalancedRight = right==null?false:(boolean)right[0];
        Object currentNodeSumTreeObj[]=null;
        if( isBalancedLeft && isBalancedRight && root.val==leftHeight+rightHeight){

            currentNodeSumTreeObj = new Object[]{true, leftHeight + rightHeight + root.val};
            return currentNodeSumTreeObj;


        }else{
            currentNodeSumTreeObj= new Object[]{false,leftHeight+rightHeight + root.val};
            return currentNodeSumTreeObj;
        }



    }


    Object[] isSumTreeOrNotWitArray(Node root){

        //base case leaf node
        if(root.left==null && root.right==null)
        {
            Object[] obj = new Object[]{true,root.val};
            return obj;
        }
        Object[] left=null,right=null ;
        if(root.left!=null)
            left= isSumTreeOrNotWitArray(root.left);

        if(root.right!=null)
            right= isSumTreeOrNotWitArray(root.right);

        int leftHeight=     left==null?0:(int)left[1];
        int rightHeight=    right==null?0:(int)right[1];
        Object currentNodeSumTreeObj[]=null;
        if(left!=null && right!=null){


            if((boolean)left[0] && (boolean)right[0] && root.val==leftHeight+rightHeight ) {
                 currentNodeSumTreeObj = new Object[]{true, leftHeight + rightHeight + root.val};
                return currentNodeSumTreeObj;
            }else {
                currentNodeSumTreeObj = new Object[]{false, leftHeight + rightHeight + root.val};
                return currentNodeSumTreeObj;
            }

        }else{
             currentNodeSumTreeObj= new Object[]{false,leftHeight+rightHeight + root.val};
            return currentNodeSumTreeObj;
        }



    }


    boolean isSumTree(Node root)
    {
        // Your code here
        if(root==null)
            return false;

        //method 1 > isSumTreeOrNot(root);
        //method 2 >
        Object[] obj =  isSumTreeOrNotWitArray(root);

        return  obj[0]==null?false:(Boolean)obj[0];

    }


}
