import java.util.*;
public class linearpower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xpn= power(x,n);
        System.out.print(xpn);
    }
    public static int power( int x,int  n) {
        if(n==0){
            return 1;
        }
        int xpnm1= power(x,n-1);
        int  xpn=xpnm1*x;
        return xpn;
    }
}
