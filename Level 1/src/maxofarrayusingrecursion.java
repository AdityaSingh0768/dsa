import java.util.*;
public class maxofarrayusingrecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int max = maxofarray(arr, 0);
        System.out.println(max);
    }

    public static int maxofarray(int[] arr, int i) {
        if (i == arr.length-1 ) {
             return arr[i];
        }
        int misa = maxofarray(arr, i + 1);// misa is champion  between 1to last index
        if (arr[i] > misa) {// final fight
            return arr[i];
        } else {
            return misa;
        }
    }
}
