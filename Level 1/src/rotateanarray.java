import java.util.*;
public class rotateanarray {
    public static void main ( String[] args){
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int k =scn.nextInt();
        rotate(arr,k);
        display(arr);
    }
    public static void  display(int[] arr){
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void rotate(int []arr, int k){

        k=k%arr.length;
        if(k<=0){
            k=k+arr.length;
        }
        reverse(arr,0,arr.length-1-k);
        reverse(arr , arr.length-k,arr.length-1);
        reverse(arr , 0,arr.length-1);

    }
    public static void reverse(int [] arr ,int low , int high){
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
}
    }
}
