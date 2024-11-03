import java.util.*;
public class fllodfillrecursion {
    public static void main(String[] args){
        Scanner scn =   new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[][] maze = new int[n][m];
            for( int i=0;i<maze.length;i++){
                for( int j=0;j<maze[0].length;j++){
                        maze[i][j]=scn.nextInt();
                }
            }
            FLOODFILL(maze,0,0,"");
    }
    public static void FLOODFILL(int[][] maze,int sr, int sc, String asf){
                 if(sr==maze.length-1&&sc==maze[0].length-1){
                     System.out.println(asf);
                     return;
                 }
                 if(sr>=maze.length||sr<0||sc>=maze[0].length||sc<0||maze[sr][sc]==1){
                     return;
                 }
                 maze[sr][sc]=1;//cyclye loop na bne jo hm jis dabbe ko cross  kr diya usme wapis na jaye
                 FLOODFILL(maze,sr,sc+1,asf+'r');//rigth
                 FLOODFILL(maze,sr+1,sc,asf+'r');//down
                 FLOODFILL(maze,sr-1,sc,asf+'r');//up
                 FLOODFILL(maze,sr,sc-1,asf+'r');//left
                  maze[sr][sc]=0;//wapis zero krna h jiss other path me 1 na aa jaye



    }
}
