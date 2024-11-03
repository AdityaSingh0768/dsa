import java.util.*;
public class selectionsort2 {
    public static void main(String[]  args){
        Scanner scn = new Scanner (System.in);
        int  n= scn.nextInt();
        int[] arr= new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for ( int  str =0;str<arr.length-1;str++){     //    no of journey n-1 hoti h
            int mindex=str;   // first elment ko min man lenge
            for ( int j=str+1;j<arr.length-1;j++){// ab loop chalu krke min find krenge
                if(arr[j]<arr[mindex]){
                    mindex=j;
                }
            }
            //last me first value aur minindex ki swapping hogi
            int temp =arr[str];
            arr[str]=arr[mindex];
            arr[mindex]=temp;
        }
        for ( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
