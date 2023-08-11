package searching;

public class BinarySearch {

    static int operations=0;
    public static void main(String[] args) throws Exception {
        int strArray[] = new int[]{2,3,4,7,9,10,11};

        int index= binarySearch(strArray,11);
        int val =index<0?index:strArray[index];
        System.out.println(val);
        System.out.println("operations" +operations);
    }

      static int  binarySearch(int strArray[], int requiredVal) throws Exception{

        int index=0,start=0;
        int end=strArray.length-1;
          int mid=(start+end)/2;

          while(start<=end){
              operations++;
            if(strArray[mid]==requiredVal){

                return mid;}
            else if (strArray[mid]<requiredVal) {
                start=mid+1;
                mid=mid+1;
            }else {
                end=mid-1;
            }


          }

        return -1;
    }
}
