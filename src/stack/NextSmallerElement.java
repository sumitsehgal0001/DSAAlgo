package stack;

import java.util.*;


public class NextSmallerElement {

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
            list.set(index, stackElement);
            // System.out.println("arraylist" + arr );
            st.push(index);
            //System.out.println("stackElement" + stackElement + " index " + index );
            index--;

        }
        return list;
    }

    public static void main(String[] args) {
        List list =  Arrays.asList(new Integer[]{3,3,1,1});
        ArrayList inputList = new ArrayList<Integer>(list);
        // System.out.println("arraylist" + arr );
        list=NextSmallerElement.nextSmallerElement(inputList,list.size());
        System.out.println(list);
    }


}
