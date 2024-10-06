
import java.util.Scanner;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int count= scn.nextInt();
        for (int ja=1;ja<=count;ja++){
            int val=x*ja;
            System.out.println( x +" * " + ja + " = " + val);
        }

    }
}


