import java.util.Scanner;

public class isprimenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        for(int i=1;i<=t;i++){
            int num = scn.nextInt();
            int div = 2;
            boolean isprime = true;
            while (div * div <= num) {
                int rem = num % div;
                if (rem == 0){
                    isprime = false;
                    break;}
                div++;
            }
            if (isprime == true) {
                System.out.println("is prime");
            } else
                System.out.println("is not prime");
        }
    }
}
