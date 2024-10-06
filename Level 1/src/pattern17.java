import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n / 2; // Number of spaces
        int nst = 1;    // Number of stars
        int val = 1;    // Starting value for printing

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            // Print pattern numbers
            int ival = val; // Temporary variable to hold current value to print
            for (int j = 1; j <= nst; j++) {
                System.out.print(ival + "\t");
                if (j <= nst / 2) {
                    ival++;
                } else {
                    ival--;
                }
            }

            // Update the starting value for the next row
            if (i <= n / 2) {
                val++;
            } else {
                val--;
            }

            // Update number of spaces and stars for next row
            if (i <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }

            // Move to the next line
            System.out.println();
        }

        scn.close(); // Close the scanner
    }
}
