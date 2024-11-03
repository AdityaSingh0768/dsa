import java.util.*;
public class countsort {

    public static void countsort(int[] arr , int min , int max  ){
        //  creating answer array and frequecy array
        int range= max-min+1;
        int[] farr= new int[ range];
        int[] ans= new int[arr.length];
        // collecting frequency
        for ( int i=0;i<arr.length;i++){
            int val=arr[i];
            farr[val-min]++; //  spot pta krke wha ki frequency increase kr di
        }
        // covert frequency array into prefixsumarray
         for ( int i=1;i<farr.length;i++){ // array 1 se chalu hoga jisse -1 index access na h o
             farr[i]=farr[i]+farr[i-1];
         }
         // fill the ans array
         for ( int i=arr.length-1;i>=0;i--){
                   int val=arr[i];
                   int pos=farr[val-min];
                   ans[pos-1]=val;
                   farr[val-min]--;
         }
         // fill the original array with ans array
        for ( int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
         for ( int i=0;i<arr.length;i++){
             arr[i]= scn.nextInt();
             max=Math.max(max,arr[i]);
             min=Math.min(min,arr[i]);
         }
         countsort(arr, min ,max);
         for ( int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
    }

}
