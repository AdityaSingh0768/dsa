import java.util.Scanner;

public class printfibbonacitiiln {

        public static void main(String[] args){
            Scanner scn =new Scanner(System.in);
            int a=0;
            int b=1;
            int n =scn.nextInt();
            for(int i=1;i<=n;i++){
                int c=a+b;
                System.out.print(a+" ");
                a=b;
                b=c;
            }}
}
