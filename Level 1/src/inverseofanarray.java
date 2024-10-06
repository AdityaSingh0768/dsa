import java.util.*;
public class inverseofanarray {
    public static void  main (String[]  args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []inv=new int [n];
        for( int i=0;i<arr.length;i++){
            inv[arr[i]]=i;
        }
        for( int i=0;i<inv.length;i++)
        {
            System.out.print(inv[i]);
        }
    }
}
