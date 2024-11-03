import java.util.*;
public class tagetsumsubsetusingrecursion {
    public static void main(String[]  args){
        Scanner scn =  new Scanner(System.in);
        int n=  scn.nextInt();
        int[] arr= new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int tar= scn.nextInt();
        printtargersumsubset(arr,0,"",0,tar);
    }
    public static void printtargersumsubset(int[] arr,int idx, String asf,int sos,int tar){
//        if(sos>tar){
//            return;
//        }  this base is only valid in case of positive number 
       if(idx==arr.length){
            if(sos==tar){
                System.out.println(asf+".");
            }
            return;
        }
        printtargersumsubset(arr,idx+1,asf+arr[idx]+", ",sos+arr[idx],tar);
        printtargersumsubset(arr,idx+1,asf,sos,tar);
    }

}
