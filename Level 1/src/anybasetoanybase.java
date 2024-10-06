import java.util.*;
public class anybasetoanybase {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourcebase = scn.nextInt();
        int destbase= scn.nextInt();
        int ans= convertb1tob2(n,sourcebase,destbase);
        System.out.println(ans);
    }
    public  static int convertb1tob2(int n, int b1, int b2){
        int dec= getvalueindecimal(n,b1);// b1 to decimal
        int ans=getvalueinbase(dec,b2);// decimal to b2
        return ans;
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