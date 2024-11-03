import java.util.*;
public class moveallzereostofrontwithorderofnonzero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] sort( int[] arr){
        int i=arr.length-1;
        int j=arr.length-1;
        while(i>=0){
            if(arr[i]==0){
                i--;
            }else {
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i--;
                j--;
            }
        }
        return arr;


    }
}
