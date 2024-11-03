import java.util.*;
public class quicksort {
    public static void quicksort(int[] arr, int lo, int hi){
                 if(lo>hi){
                     return;
                 }
                  int pivot=arr[hi];
                int pidx=  partition(arr,lo,hi,pivot); // ye pidx ki correct position h
                 quicksort(arr,lo,pidx-1);// ye pivot se phelle ka sort krke dega
                 quicksort(arr,pidx+1,hi);// ye pivot ke baad ko sort krrke dega
    }
    // pivot reaches its correct position
    // j is at the first largest nu
    // j-1 is where pivot is
    public static int  partition( int[] arr, int lo ,int hi , int pivot ){
        int i=lo;
        int j=lo;
        while(i<=hi){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return (j-1);// pivot index return kr rhe h hum
    }

     public  static void main(String[] args){
         Scanner scn = new Scanner (System.in);
              int n= scn.nextInt();
              int[] arr = new int[n];
               for ( int i=0;i<arr.length;i++) {
                   arr[i] = scn.nextInt();
               }
               quicksort(arr,0,arr.length-1);
               print(arr);

     }
     public static void swap( int[] arr, int i , int j){
           int temp=arr[i];
           arr[i]= arr[j];
           arr[j]=temp;
     }
     public static void print( int [] arr){
         for ( int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
     }

}
