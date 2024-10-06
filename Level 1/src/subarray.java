import  java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        {
            int n1 = scn.nextInt();
            int[] arr = new int[n1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            for(int si=0;si<arr.length;si++)
            {
                for(int ei=si;ei<arr.length;ei++){
                    for( int i=si;i<=ei;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

