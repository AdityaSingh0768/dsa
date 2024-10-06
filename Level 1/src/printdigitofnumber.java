
import java.util.*;
public class printdigitofnumber {
    public static void main (String[] args){
        Scanner scn= new Scanner(System.in);
        int n =scn.nextInt();
        int div=1;
       int   temp=n;
        while(temp>=10)
        {
            temp=temp/10;
            div*=10;
        }
          while(div>=1){
                 int quo=n/div;
                  int rem=n%div;
                  System.out.println(quo);
                  n=rem;
                  div=div/10;
          }
    }
}
