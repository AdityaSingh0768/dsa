import java.util.*;
public class sort012 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr=  new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        // 0 to j-1 all zereos
        // j to i-1 all ones
        // k+1 to end all twos
        int i=0;
         int j=0;
         int k=arr.length-1;
         while(i<=k){
             if(arr[i]==1){
                 i++;

             }else if(arr[i]==0){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 i++;
                 j++;

             }else if (arr[i]==2){
                 int temp=arr[i];
                 arr[i]=arr[k];
                 arr[k]=temp;
                 k--;
             }
         } for ( int z=0;z<arr.length;z++) {
            System.out.print(arr[z]);
        }
    }

}

