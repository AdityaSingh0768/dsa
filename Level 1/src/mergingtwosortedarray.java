import java.util.*;
public class mergingtwosortedarray {
    public static void main(String[]  args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        int[] mergedarray=mergetwoarray(arr1,arr2);
        for ( int i=0;i<mergedarray.length;i++){
           System.out.print(mergedarray[i]+" ") ;
        }
    }
    public static int[] mergetwoarray(int[] arr1, int[] arr2){
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
