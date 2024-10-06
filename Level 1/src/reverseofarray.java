import  java.util.Scanner;
public class reverseofarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        {
            int n1 = scn.nextInt();
            int[] arr = new int[n1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int left=0;
            int right=arr.length-1;
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            for(  int x=0;x<arr.length;x++){
                System.out.println(arr[x]);
            }
        }
    }

}

