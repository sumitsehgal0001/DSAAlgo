package java8;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8CodingQuestions {

    public static List<EmployeeBean> beanList=new ArrayList<>();

    public static List<Integer> listOfString=Arrays.asList(2,1,4,10,7,8);

    public static Map<Integer ,EmployeeBean> map = new HashMap<>();

    public static Map<String ,String> mapOfString = new HashMap<String ,String>() {{
            put("1", "z");
            put("2", "b");
            put("3", "e");
    }};

    static {
        beanList.add(new EmployeeBean(1,"a"));
        beanList.add(new EmployeeBean(2,"b"));
        beanList.add(new EmployeeBean(1,"c"));
        beanList.add(new EmployeeBean(4,"d"));

        AtomicInteger at = new AtomicInteger();
       map=   beanList.stream().collect(Collectors.toMap(a -> at.getAndIncrement(), b-> b));




    }




    public static void main(String[] args) {
        Java8CodingQuestions obj = new Java8CodingQuestions();
       // 1. obj.stringJoiner();
        // 2 .obj.print10RandomNumbers();

        //obj.printFirst10ElementsOfList();
        //obj.printMinNumberFromList();
      //  obj.reduceFunctionTest();
       // obj.test2();

        //obj.practice();

      System.out.println("mapOfString"+mapOfString);
        LinkedHashMap map =mapOfString.entrySet().stream().filter(e -> e.getValue().equalsIgnoreCase("z")).
                collect(Collectors.toMap(e->e.getKey(),e->e.getValue(), (a,b)->a, LinkedHashMap::new));
        System.out.println("filter"+map);

        Comparator<Map.Entry<Integer,Integer>> comp1 = (a,b) -> b.getValue().
                compareTo(a.getValue());

        Comparator<Entry<String,String>> comp = (a,b) -> a.getValue().compareTo(b.getValue());
        LinkedHashMap<String,String> mapSortedByvalye =mapOfString.entrySet().stream().sorted(comp).
                collect(Collectors.toMap(e->e.getKey(),e->e.getValue(), (a,b)->a, LinkedHashMap::new));
        System.out.println("mapSortedByvalye"+mapSortedByvalye);

       // int[] arr =   mapSortedByvalye.entrySet().stream().map(e->e.getValue()).limit(2).toArray(int[]::new);
       // System.out.println(Arrays.toString(arr)+"arr");

        }

        public void practice(){

        String str[] = new String[]{"a","z","c"};
            Arrays.sort(str);
            //Arrays.
            List<List<String>> result = new ArrayList<>();

        }






    public void test2(){

      //  Map<Integer ,String> map =  Collections.singletonMap(new Integer(10), "ss");

        AtomicInteger i = new AtomicInteger();
        map=   beanList.stream().collect(Collectors.toMap(e-> i.getAndIncrement(),e-> e, (a,b)->a, LinkedHashMap::new));

        Map<Integer,List<String>> m1=     map.entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue().getId(),
                Collectors.mapping(e -> e.getValue().getName(),Collectors.toList())) );
        System.out.println(m1);


    }











    public void sortMapWithBeanDescOrder(){

        Comparator<EmployeeBean> c = (a,b) -> a.getName().compareTo(b.getName());

        LinkedHashMap<Integer,EmployeeBean> lmap =map.entrySet().stream().sorted(Entry.comparingByValue(c)).
                collect(Collectors.toMap(a -> a.getKey(),a -> a.getValue(),(a,b)->a,LinkedHashMap::new ));

        lmap.entrySet().forEach(e -> System.out.println(e.getValue().getName()));

    }




















    public void test(){

        ArrayList<Integer> list = new ArrayList(Arrays.asList(new Integer[]{1,2,3,4}));
        ArrayList<Integer> list2 =  list.stream().mapToInt( e -> e).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        //IntStream.range(0,20).spliterator().forEachRemaining((IntConsumer) e -> System.out.println(e));
        IntStream i =IntStream.range(0, 20);
        ArrayList<Integer> list3 = (ArrayList<Integer>)IntStream.range(0, 20).boxed().collect(Collectors.toList());
        ArrayList<Integer> list4 = (ArrayList<Integer>)IntStream.range(0, 20).mapToObj(Integer::new).collect(Collectors.toList());
        System.out.println(list2 + "list2");
    }


    public void builtMap(){
        //desc
        ArrayList<String> list = new ArrayList();
        Map<String,ArrayList<String>> m =  new HashMap();
        list.stream().forEach( a -> m.computeIfAbsent(a, b -> new ArrayList<>() )  );


    }

    public void reduceFunctionTest(){
        //Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,156})
        ArrayList<Integer> list = new ArrayList(Arrays.asList(new Integer[]{1,2,3,4}));
   int i=     Arrays.asList("one", "two","three","four")
                .parallelStream()
                .reduce(0,
                        (accumulatedInt, str) -> accumulatedInt + str.length(),                 //accumulator
                        (accumulatedInt, accumulatedInt2) -> accumulatedInt + accumulatedInt2);
        System.out.println(i);

    }

    public void stringJoiner(){
        StringJoiner st = new StringJoiner(",");
        st.add("a");
        st.add("a");
        st.add("a");
        System.out.println(st);
    }

    public void printFirst10ElementsOfList(){
        ArrayList list = new ArrayList(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,156}));
        list.stream().limit(10).forEach(System.out::println);

    }

    public void print10RandomNumbers(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

    }

    public void printMinNumberFromList(){
        //
        ArrayList list = new ArrayList(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,156}));
        list.stream().mapToInt(i -> (Integer) i).min().ifPresent(System.out::println);

    }

    public void sortStringInAscAndDescOrder(){
        //desc
        ArrayList<String> list = new ArrayList();
        list.stream().sorted(Comparator.reverseOrder());

        //asc
        list.stream().sorted();

    }



}
