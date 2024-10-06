import java.util.*;
public class factorialwithrecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f= factorial(n);
        System.out.print(f);
    }
public static int factorial( int n) {
        if(n==0){
            return 1;
        }
        int fnm1= factorial(n-1);
        int  fn=n*fnm1;
        return fn;
    }
}
