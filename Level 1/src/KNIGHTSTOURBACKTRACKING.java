import java.util.*;
public class KNIGHTSTOURBACKTRACKING {
    public static void main(String[] args){
        Scanner scn =  new Scanner (System.in);
        int sz= scn.nextInt();
        int[][] chess= new int[sz][sz];
        int r= scn.nextInt();
        int c= scn.nextInt();
        printknighttour(chess,r,c,1);

    }
    public static void printknighttour(int[][] chess,int r, int c,int upcomingmove){
        if(r>=chess.length||c>=chess[0].length||r<0||c<0|| chess[r][c]!=0){//subtle baat 3 can lead to array index out of bound
            return;
        }
         else if(upcomingmove==chess.length*chess.length){
             chess[r][c]=upcomingmove;//subtle baat ek -you will see only 1 to 24 and zero in 25th place
            chessdisplay(chess);
            chess[r][c]=0;// subtle baat 2 -you would  only get one answer
        }

        chess[r][c]=upcomingmove;
        printknighttour(chess,r-2,c+1,upcomingmove+1);
        printknighttour(chess,r-1,c+2,upcomingmove+1);
        printknighttour(chess,r+1,c+2,upcomingmove+1);
        printknighttour(chess,r+2,c+1,upcomingmove+1);
        printknighttour(chess,r+1,c-1,upcomingmove+1);
        printknighttour(chess,r+1,c-2,upcomingmove+1);
        printknighttour(chess,r-1,c-2,upcomingmove+1);
        printknighttour(chess,r-2,c-1,upcomingmove+1);
        chess[r][c]=0;

    }
    public static void chessdisplay(int[][] chess){
        for ( int i=0;i<chess.length;i++){
            for ( int j=0;j<chess[0].length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
