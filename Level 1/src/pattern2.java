import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int  nstars=n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=nstars; j++) {
                System.out.print( "*\t");
//                slash t se space gain achieve krte h
            }
            nstars--;

            System.out.println( );
        }
    }
}