
import java.util.Scanner;

public class GCDANDLCM {
    public static void main (String[] args){

        Scanner scn= new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int tn1=n1;
        int tn2=n2;
        while(tn1%tn2!=0){
            int r=tn1%tn2;
//            agla divide kaun krega agla divide kaun hoga
            tn1=tn2;
            tn2=r;
        }
        int GCD =tn2;
        int LCM=(n1*n2)/GCD;
        System.out.println(GCD);
        System.out.println(LCM);
    }
}

