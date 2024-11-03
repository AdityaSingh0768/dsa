
import java.util.*;
public class targetsumtripleton2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        Arrays.sort(arr); // arrays sort kiya inbuilt fn ka istemal krke
        for ( int i=0;i<arr.length;i++) {
            int ntr=target-arr[i];//new target banya for loop se
            int left = i+1;
            int right = arr.length - 1;
            boolean atleastfound=false;
            while (left < right) {//  equal to isliye nhi lagay kyuki element repeat ho jayega
                if (arr[left] + arr[right] < ntr) {
                    left++;
                } else if (arr[left] + arr[right] > ntr) {
                    right--;
                } else {
                    System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                    left++;
                    right--;
                    atleastfound=true;
                }
            }
            if(atleastfound==false){
                break;
            }
        }

    }
}
