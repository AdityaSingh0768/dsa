import java.util.*;
public class printzigzagrecursiontwocall {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        pzz(n);

    }
    // pzz(3)= 3 211121112 211121112 3
    //pzz(2)=  2 111 2 111 2
    //exp weds faith   pzz(3)= n pzz(2) n pzz(2) n
    public static void pzz(int n){
        if( n==0) {
            return;
        }
            System.out.print(n+" ");
            pzz(n-1);
            System.out.print(n+" ");
            pzz(n-1);
            System.out.print(n+" ");

        }

}

