import java.util.*;
public class bubblesort {
    public static void main(String[]  args){
        Scanner scn = new Scanner (System.in);
        int  n= scn.nextInt();
        int[] arr= new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for (  int itr=1;itr<=arr.length-1;itr++){//    no of journey n-1 hoti h
            for ( int j=0;j<arr.length-itr;j++){// haar journey ke baad ek km move krna hota n
                if(arr[j+1]<arr[j]){
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for ( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}




