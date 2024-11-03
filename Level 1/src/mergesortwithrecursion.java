import java.util.*;
public class mergesortwithrecursion {
    public static void main(String[]  args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]= scn .nextInt();
        }
        arr= mergesort( arr,0,arr.length-1);
        for ( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] mergesort(int[] arr, int lo, int hi ){
        if(lo==hi){
            int[] ba= new int[1];
            ba[0]=arr[lo];
            return ba;
        }
        int mid=(lo+hi)/2;
        int[]  fsh=mergesort(arr,lo,mid);
        int[]  ssh=mergesort(arr,mid+1,hi);
        int[] farr =merge2sortedarray( fsh,ssh);
        return farr ;
    }
    public static int[] merge2sortedarray(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        if(i==arr1.length){
            while(j<arr2.length){
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }else if (j==arr2.length) {
            while (i < arr1.length) {
                ans[k] = arr1[i];
                k++;
                i++;
            }
        }
        return ans;
    }
}
