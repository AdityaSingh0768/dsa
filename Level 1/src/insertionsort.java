import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();

        int []arr= new int [n];
        for ( int i=0; i<arr.length; i++) {
            arr[i]= scn.nextInt();
        }
        for ( int i=1; i<arr.length; i++) {
            for (  int j=i-1; j>=0; j--) {//insertion left hota h
                if(arr[j]>arr[j+1]) {// check apne se right wale se hota h
                    int  temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                } else {
                    break;
                }
            }
        }
        for ( int i=0; i<arr.length; i++) {
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
