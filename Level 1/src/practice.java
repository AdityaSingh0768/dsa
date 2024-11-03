import java.util.*;
public class practice {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            int n=  scn .nextInt();
            int[] arr= new int[n];
            for ( int i=0;i<arr.length;i++){
                arr[i]= scn.nextInt();
            }


    }

}


// binary search 
//int data= scn.nextInt();
//int isfound=-1;
//          for ( int i=0;i<arr.length;i++){
//int l=0;
//int r=arr.length-1;
//int mid =(l+r)/2;
//               if(arr[mid]>data){
//r= mid-1;
//        }else if (arr[mid]<data){
//l=mid+1;
//        } else {
//isfound=mid;
//                   break;
//                           }
//                           }
//                           System.out.println(isfound);


// linear search
//int tar= scn.nextInt();
//int  isfound=-1;
//            for (int i=0;i<arr.length;i++){
//        if(arr[i]==tar){
//isfound=i;
//                }
//                        }
//                        if( isfound==-1)
//        {
//        System.out.println("not found");
//            }else {
//                    System.out.println(isfound);
//            }


//insertionsort
//for ( int i=1;i<=arr.length-1;i++){
//        for( int j=i-1;j>=0;j--){
//        if(arr[j]>arr[j+1]){
//int temp=arr[j];
//arr[j]=arr[j+1];
//arr[j+1]=temp;
//                }
//                        }
//                        }
//bubble sort
//for ( int i=0;i<arr.length-1;i++){
//                for( int j=0;j<arr.length-i-1;j++){
//                    if(arr[j]>arr[j+1]){
//                        int temp=arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
//                    }
//                }
//            }
// selection sort
//  for ( int i=0;i<arr.length-1;i++){
//int mindx=i;
//
//            for( int j=i+1;j<=arr.length-1;j++) {
//        if (arr[mindx] > arr[j]) {
//mindx = j;
//                }
//                        }
//int temp=arr[i];
//arr[i]=arr[mindx];
//arr[mindx]=temp;
//        }