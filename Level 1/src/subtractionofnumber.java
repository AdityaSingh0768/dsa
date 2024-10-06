import java.util.Scanner;
public class subtractionofnumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2= scn.nextInt();
        int difference=getdifference(n1,n2,b);
        System.out.println(difference);
    }
    public static int getdifference( int n1,int n2,int b)
    {
        int difference=0;
        int c=0;
        int tp=1;//10^1
        while(n2>0){
            int d1=n1%10;
            n1=n1/10;
            int d2=n2%10;
            n2=n2/10;
            int d=d1-c-d2;
            if(d<0){
                d=d+b;
               c=1;
            }else{
                c=0;
            }
            difference=difference+d*tp;
            tp=tp*10;

        }
        return difference;
    }
}
