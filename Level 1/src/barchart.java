import  java.util.Scanner;
public class barchart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        {
            int n1 = scn.nextInt();
            int[] arr = new int[n1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max=arr[i];
                }
            }
            for (int ht = max; ht >= 1; ht--) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= ht) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } System.out.println();
            }
        }
    }
}


