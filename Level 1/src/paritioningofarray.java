import java.util.*;
public class paritioningofarray {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n=  scn.nextInt();
        int[] arr=  new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int pivot= scn.nextInt();
        int i=0;
        int j=0;
        while(i<arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[i] ;
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        print(arr);
    }
    public static void print( int [] arr ){
        for ( int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}