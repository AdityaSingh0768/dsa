import java.util.Scanner;

public class benjaminbulb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i*i<=n){
            System.out.println(i*i);
            i++;
        }
    }
}
