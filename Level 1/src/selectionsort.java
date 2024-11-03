import java.util.*;
public class selectionsort {
    public static void main(String[]  args){
        Scanner scn = new Scanner (System.in);
        int  n= scn.nextInt();
        int[] arr= new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for (  int itr=0;itr<arr.length-1;itr++){//    no of journey n-1 hoti h
            for ( int j=itr+1;j<arr.length;j++){// haar journey ke baad ek km move krna hota n
                if(arr[j]<arr[itr]){
                    int temp= arr[itr];
                    arr[itr]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for ( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}

