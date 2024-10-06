import java.util.Scanner;

public class printallprimenumber{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for( int num=low;num<=high;num++){
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
            System.out.print( num+" ");
        }
    }}
}

