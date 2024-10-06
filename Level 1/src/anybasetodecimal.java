
import java.util.Scanner;
public class anybasetodecimal{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int b=scn.nextInt();
        int d= getvalueindecimal(n, b);
       // n value h number ki
        // jis base me convert krna h
        System.out.println(d);
    }
    public static int getvalueindecimal( int n,int b){
        int dn=0;
        int bp=1;// bp^0;
        while(n!=0){
            int r= n%10;
            n=n/10;
            dn=dn+r*bp;
            bp=bp*b;
        }
        return dn;
    }
}
