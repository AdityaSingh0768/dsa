
import java.util.Scanner;
public class decimaltoanybase{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int b=scn.nextInt();
        int dn= getvalueinbase(n, b);
        System.out.println(dn);
    }
    public static int getvalueinbase( int n,int b){
        int dn=0;
        int tp=1;
        while(n!=0){
            int r= n%b;
            n=n/b;
            dn=dn+r*tp;
            tp=tp*10;
        }
        return dn;
    }
}
