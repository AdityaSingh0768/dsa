import java.util.*;
public class printdecreasing {
    public static void main(String[]  args ){
        Scanner scn= new Scanner (System.in);
        int n= scn.nextInt();
        printdecreasing(n);

     }
     //expectation pd(n)= n n-1 n-2 n-3
    // faith pd(n-1) = n-1 n-2 n-3....
    // expectation weds faith = n pd(4)
     public static void printdecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       printdecreasing(n-1);

     }
}
