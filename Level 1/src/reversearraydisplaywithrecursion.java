import java.util.*;
public class reversearraydisplaywithrecursion {
    public static void  main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for( int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        display(arr,0);
    }//e=da(a,0)= pura ulta print kr dega
    //f=da(a,1)= first ka chodh kr pura ulta printk rdega
    //e w f da(a,0)=da(a,0) print a(0);
    public static void display(int[] arr, int i){
        if(i==arr.length){
            return;
        }
        display(arr ,i+1);
        System.out.println(arr[i]);

    }

}
