import java.util.*;
public class targetsumpairnlogncomplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target= scn.nextInt();
        Arrays.sort(arr); // arrays sort kiya inbuilt fn ka istemal krke
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){//  equal to isliye nhi lagay kyuki element repeat ho jayega
//            if(arr[left]+arr[right]<target){
//                left++;
//            }
//            else if(arr[left]+arr[right]>target){
//                right--;
//            }
//            else{
//                System.out.println(arr[left]);
//                System.out.println(arr[right]);
//                left++;
//                right--;
//            }
//        }
        for ( int i=0;i<arr.length;i++){
            int ntar= target-arr[i];
            int left=0;
            if(ntar<arr[i]){  // jisme ulta pair print na ho 12, ka 21 na print ho  kyuki
                break;         // agr baad wala no samll hua to wo break ho  jayegab
            }
            int right=arr.length-1;
            while( left<=right){
                int mid=(left+right)/2;
                if (arr[mid]>ntar){
                    right = mid-1;
                }
                else if(arr[mid]<ntar)
                    left=mid+1;
                else {
                    System.out.println(arr[i]+" "+arr[mid]);
                    break;
                }
            }

        }
    }
}