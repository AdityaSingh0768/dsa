import java.util.*;
public class formtheploynommilawith0ncomplexity {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int x=  scn.nextInt();
        int c=n;
        int pox=x;
        int ans=0;
        while(c>0){
            int term= c*pox;
            ans=ans+term;
            c--;
            pox=pox*x;

        }
        System.out.println(ans);

    }
}
