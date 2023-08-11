package sorting;

import java.util.*;
import java.util.Collections;

public class SelectionSort {


    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(2, 6, 4),
                Arrays.asList(1,2,5), Arrays.asList(1, 1, 6), Arrays.asList(1, 7, 6));
        System.out.println(list);
        for (List<Integer> l : list) {
            Collections.sort(l);
        }
        System.out.println(list);
        Collections.sort(list, new Comparator<List<Integer>>() {
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0)) + o1.get(1).compareTo(o2.get(1))  ;
            }
        });


        System.out.println(list);
        //[[1, 1, 6], [1, 2, 5], [2, 4, 6], [1, 6, 7]]
      //  System.out.println("list 2 "+list1 );

    }

    public static void main1(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list.add(list1);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
       // list2.add(5);
        list.add(list2);
        System.out.println("list "+list );
        Collections.reverse(list);
      //  Collections.sort(list, (ArrayList<Integer> a1, ArrayList<Integer> a2) -> ((Integer)a1.size()).compareTo((Integer)a2.size()) );
        System.out.println("list 2 "+list );
    }
}
