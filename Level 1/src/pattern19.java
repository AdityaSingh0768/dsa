import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       int   nsp=2*n-3;
        int nst=1;

        for( int i=1;i<=n ;i++)
        {
//            System.out.print( nst+"stars"+nsp+"space"+ nst+"stars");
                 int val=1;
                for (int j = 1; j <= nst; j++)
                {
                    System.out.print( val+"\t");
                    val++;
                }

            for ( int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            if(i==n) {
                val=nst-1;
                for (int j = 1; j <= nst-1 ; j++) {
                    System.out.print(val+"\t");
                    val--;
                }
            }
            else{
                  val=nst;
                    for (int j = 1; j <=nst; j++)
                     {
                        System.out.print(val+"\t");
                        val--;
                    }
                }

            nsp-=2;
            nst++;

            System.out.println();
        }
    }
}
//
// import java.util.Scanner;
//
//public class pattern19 {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int nsp = 2 * n - 3;
//        int nst = 1;
//
//        for (int i = 1; i <= n; i++) {
////            System.out.print( nst+"stars"+nsp+"space"+ nst+"stars");
//
//            for (int j = 1; j <= nst; j++) {
//                System.out.print(j + "\t");
//
//            }
//
//            for (int j = 1; j <= nsp; j++) {
//                System.out.print("\t");
//            }
//            if (i == n) {
//
//                for (int j = nst - 1; j >= 1; j--) {
//                    System.out.print(j + "\t");
//
//                }
//            } else {
//
//                for (int j = nst; j >= 1; j--) {
//                    System.out.print(j + "\t");
//
//                }
//            }
//
//            nsp -= 2;
//            nst++;
//
//            System.out.println();
//        }
//    }
//}