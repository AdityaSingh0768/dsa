import java.util.Scanner;

 import  java.util.Scanner;
    public class reverseanumber{
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int dig = 0;
            while (n != 0) {
                int quo = n/10 ;
                int rem=n%10;
                n=quo;
                System.out.print(rem);
            }

        }
    }

