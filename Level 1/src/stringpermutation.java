import java.util.*;
public class stringpermutation {
    public static void main(String[]  args ){
        Scanner scn = new Scanner (System.in);
        String str= scn.nextLine();
        solution(str);
    }
    public static void solution( String str){
        int n= factorial(str.length());
        for( int i=0;i<n;i++){
            StringBuilder s= new StringBuilder(str);
            int dvd=i;
            for( int div=s.length();div>=1;div--){
                int q=dvd/div;
                int r=dvd%div;
                System.out.print(s.charAt(r));
                dvd=q;
                s.deleteCharAt(r);
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int f=1;
        for( int i=2;i<=n;i++){
            f=f*i;
        }
        return f;
    }


}
