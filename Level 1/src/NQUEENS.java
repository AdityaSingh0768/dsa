import java.util.*;
public class NQUEENS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        NQUEENS(chess, "", 0);
    }
        public static void NQUEENS(int[][] chess, String  qsf, int row){

        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }
            for ( int col=0;col<chess.length;col++) {
                if (isitsafeforqueen(chess,row,col) == true) {
                    chess[row][col] = 1;
                    NQUEENS(chess, qsf + row + "-" + col+", ", row + 1);
                    chess[row][col] = 0;
                }
            }

        }
        public static boolean isitsafeforqueen(int[][] chess ,int r, int c){

              for ( int i=r-1,j=c;i>=0;i--){
                  if(chess[i][j]>0){
                      return false;
                  }
              }
              for ( int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
                  if(chess[i][j]>0){
                      return false;
                  }
              }
              for ( int i=r-1,j=c+1;i>=0&&j<chess.length;i--,j++){
                 if(chess[i][j]>0){
                     return false;
                 }
              }
              return true;
    }
    }

