package sorting;

import java.util.Arrays;

public class MergeSort {


    public void merge(int arr[],int l,int m,int r ){

        //calculate size of left & right arr
        int leftArrSize=m-l+1;  //point to remember and why?
        int rightArrSize=r-m;   //point to remember and why?

        //declare & initialize left & right arr
        int left[]=new int[leftArrSize];
        int right[]=new int[rightArrSize];

        //put values from actual arr to left & right arr based on index required
        for(int i=0;i<leftArrSize;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<rightArrSize;j++){
            right[j]=arr[m+1+j];
        }


        //compare values or actual sorting happen at this place
        int i=0,j=0,k=l;

        while(i<leftArrSize && j<rightArrSize){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        //copy remaining elements
        while(i<leftArrSize){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<rightArrSize){
            arr[k]=right[j];
            j++;
            k++;
        }




    }
    public void sort(int arr[],int l,int r ){

        if(l<r){                //point to remember and why?
            int mid =l+(r-l)/2; //point to remember and why?
            sort(arr,0,mid);  //divide left
            sort(arr,mid+1,r); //divide right
            merge(arr,l,mid,r);  // conquer
        }

    }

    public static void main(String[] args) {
        int arr[]={2,5,3,11,7,1,0,45,120,40};
        System.out.println("before > "+Arrays.toString(arr));
        new MergeSort().sort(arr,0,arr.length-1);
        System.out.println("After > "+Arrays.toString(arr));


    }
}
