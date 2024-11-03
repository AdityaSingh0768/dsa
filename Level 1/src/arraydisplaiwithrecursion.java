import java.util.*;
public class arraydisplaiwithrecursion {
    public static void  main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for( int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        display(arr,0);
    }
    // exp=das(a,0)= o to n print kr dega
    // fait=das(a,1)= 1 to all element kr dega print/
    //exp w faith(a,0)=first element khud se kro print then das(a,1) ko call krna hai
    public static void display(int[] arr, int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
         display(arr ,i+1);
    }

}
