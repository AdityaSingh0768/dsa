import java.util.*;
public class quickselect {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        for ( int i=0;i<arr.length;i++){
             arr[i]= scn.nextInt();
        }
        int k= scn.nextInt();
        int p= quickselect(arr,0,arr.length-1,k-1);
        System.out.println(p);
    }
    public static int  quickselect(int[] arr,  int lo , int hi , int k){

        int pivot=arr[hi];
       int pidx= partition(arr,lo,hi,pivot);// pivot lives at pidx which is its correct position
          if(k==pidx){
              return  pivot ;
          }else if (k>pidx){
                return quickselect(arr, pidx+1,hi,k);
          }else{
               return quickselect(arr,lo,pidx-1,k);
          }
    }
    public static int partition(int[] arr, int lo, int hi ,int pivot ){
        int i=lo;
        int j=lo;
        while(i<=hi) {
            if (arr[i] > pivot) {
                i++;
            } else {
               swap(arr,i,j);
                i++;
                j++;
            }
        }
        return j-1; // why j-1 not j?
        // j is the first of the larger element
        //pivot lives at j-1
        // pivot evetually lives at its sorted postion
    }
    public static void swap( int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}