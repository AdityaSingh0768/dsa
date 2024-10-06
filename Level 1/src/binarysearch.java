import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int data= scn.nextInt();
        int left=0;
        int foundat=-1;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(data>arr[mid]){
              left=mid+1;
            }
            else if(data<arr[mid]){
              right=mid-1;
            }
            else {
                foundat=mid;
                break;
            }
        }
        System.out.print(foundat);
    }
}


