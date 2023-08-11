package stack;

import java.util.*;

public class LargestRectangleInHistogram {

    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.

        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        ArrayList list = new ArrayList<Integer>(arr);

        int index=arr.size()-1;
        while(index>=0){

            Integer listElement=  arr.get(index);
            while(st.peek()!=-1 && arr.get(st.peek())>=listElement){
                st.pop();
            }
            Integer stackElement=st.peek()!=-1 ?arr.get(st.peek()) : -1;
            list.set(index, st.peek());
            // System.out.println("arraylist" + arr );
            st.push(index);
            //System.out.println("stackElement" + stackElement + " index " + index );
            index--;

        }
        return list;
    }

    static ArrayList<Integer> prevSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.

        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        ArrayList list = new ArrayList<Integer>(arr);

        int index=0;
        while(index<arr.size()){

            Integer listElement=  arr.get(index);
            while(st.peek()!=-1 && arr.get(st.peek())>=listElement){
                st.pop();
            }
            Integer stackElement=st.peek()!=-1 ?arr.get(st.peek()) : -1;
            list.set(index, st.peek());
            // System.out.println("arraylist" + arr );
            st.push(index);
            //System.out.println("stackElement" + stackElement + " index " + index );
            index++;

        }
        return list;
    }

    public int largestRectangleArea(int[] heights) {
        Integer[] barsheight = Arrays.stream( heights ).boxed().toArray( Integer[]::new );
        List inputList = Arrays.asList(barsheight);
        ArrayList<Integer> list = new ArrayList<Integer>(inputList);
        //System.out.println("list" +list);
        ArrayList<Integer> nextList = LargestRectangleInHistogram.nextSmallerElement(list,list.size());
        ArrayList<Integer> prevList = LargestRectangleInHistogram.prevSmallerElement(list,list.size());
        // System.out.println("nextList" +nextList);
        // System.out.println("prevList" +prevList);
        Integer area= Integer.MIN_VALUE;
        for(int i=0;i<nextList.size();i++){

            Integer length =barsheight[i];
            Integer nextElement=nextList.get(i)==-1?barsheight.length:nextList.get(i);
            Integer bredth = nextElement - prevList.get(i)-1;

            area= Math.max( area ,(length*bredth));

//System.out.println("area" +area + "length " + nextElement + "bredth " + prevList.get(i));
        }
        return area;
    }

    public static void main(String[] args) {
new LargestRectangleInHistogram().largestRectangleArea(new int[]{2,1,5,6,2,3});
    }

}
