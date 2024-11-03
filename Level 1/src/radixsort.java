import java.util.*;
public class radixsort {

    public static void radix(int[] arr) {
        int max = arr[0];
        // max find kra
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // kinti baaar call krna h wo pta kra
        int place = 1;
        while (max / place > 0) {
            count(arr, place);
            place = place * 10;
        }
    }

    public static void count(int[] arr, int exp) {

        int[] farr = new int[10];
        int[] ans = new int[arr.length];
        // collecting frequency
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i] / exp % 10;      // kewal digit chiaye puri value nhi
            farr[val]++; //   radix sort mein val - min nih krte kyuki yha pr 0 index 0 ki frequency store krta h
            // yha koi minimum value nhi h count sort ki trh
        }
        // covert frequency array into prefixsumarray
        for (int i = 1; i < farr.length; i++) { // array 1 se chalu hoga jisse -1 index access na h o
            farr[i] = farr[i] + farr[i - 1];
        }
        // fill the ans array
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i] / exp % 10;   //digit get krk rhe h
            int pos = farr[val];  // isme position direct ajjj jati kyuki min value nhi h koi
            ans[pos - 1] = arr[i]; // isme val nhi dlti pura arr[i] jata kyuki value mien digit h kewal
            farr[val]--;
        }
        // fill the original array with ans array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        radix(arr);
        print(arr);
    }
}
