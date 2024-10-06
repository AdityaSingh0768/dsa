import java.util.Scanner;

public class INVERSE {
    public static void main (String[] args){

    Scanner scn= new Scanner(System.in);
    int n =scn.nextInt();
    int p=1;
    int inv=0;
    while(n>0){
       int r=n%10;
       int q=n/10;
       n=q;
//     r@p mila h P@r ke lie p*pow(10,r-1) krenge
        inv = inv+p*(int)Math.pow(10,r-1);
       p++;
    }
    System.out.println(inv);
}
}