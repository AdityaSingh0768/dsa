 import java.util.*;
public class sortdates {
    public static void sortdates(String[] arr) {
        // day
        countsort(arr, 1000000, 100, 32);// 0to 31 index for dates
        // month
        countsort(arr, 10000, 100, 13);// 0 to 12 indexes for months
        // year
        countsort(arr, 1, 10000, 2501);// 0 to 2500  index for year given in constraints
    }
    public static void countsort(String[] arr, int div, int mod, int range) {
        int[] farr = new int[range];
        String[] ans = new String[arr.length];
        // collecting frequency
        for (int i = 0; i < arr.length; i++) {
            int val = Integer.parseInt(arr[i] )/ div % mod;
            farr[val]++; //   radix sort mein val - min nih krte kyuki yha pr 0 index 0 ki frequency store krta h
            // yha koi minimum value nhi h count sort ki trh
        }
        // covert frequency array into prefixsumarray
        for (int i = 1; i < farr.length; i++) { // array 1 se chalu hoga jisse -1 index access na h o
            farr[i] = farr[i] + farr[i - 1];
        }
        // fill the ans array
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = Integer.parseInt(arr[i]) / div %mod;
            int pos = farr[val];  // isme position direct ajjj jati kyuki min value nhi h koi
            ans[pos - 1] = arr[i]; // isme val nhi dlti pura arr[i] jata kyuki value mien digit h kewal
            farr[val]--;
        }
        // fill the original array with ans array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortdates(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
