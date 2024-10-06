import java.util.*;
public class saddlepoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            boolean issaddle = true;
            int psj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    psj = j;
                }
            }

                for (int x = 0; x < arr.length; x++) {
                    if (arr[x][psj] > min) {
                        issaddle = false;
                        break;
                    }
                }

                if (issaddle == true) {
                    System.out.print(min);
                    return;
                }


            }

        System.out.println("invalid Input");


    }

}