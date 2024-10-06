import java.util.*;
public class shellrotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] twod = new int[n][m];
        for (int i = 0; i < twod.length; i++) {
            for (int j = 0; j < twod[0].length; j++) {
                twod[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        // shell se 1-Darray;

        int[] oned = getonedfromshell(twod, s);
        //rotate the 1-D array;
        rotate(oned, r);
        //rotated array se shell;
        filltwodarray(twod, oned, s);
        // display
        display(twod);

    }


    public static int[] getonedfromshell(int[][] twod , int s) {
        int rows = twod.length;
        int cols = twod[0].length;
        int minc = s - 1;
        int minr = s - 1;
        int maxr = rows - s;
        int maxc = cols - s;
        int indx = 0;
        int  sz=2 * (maxr - minr + maxc - minc);
        int[] oned=new int[sz];
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[indx] = twod[i][j];
            indx++;
        }
        minc++;
        for (int j = minc, i = maxr; j <= maxc; j++) {
            oned[indx] = twod[i][j];
            indx++;
        }
        maxr--;
        for (int i = maxr, j = maxc; i >= minr; i--) {
            oned[indx] = twod[i][j];
            indx++;
        }
        maxc--;
        for (int j = maxc, i = minr; j >= minc; j--) {
            oned[indx] = twod[i][j];
            indx++;
        }
        minr++;
        return oned;

    }

    public static void filltwodarray(int[][] twod,int[] oned,int s){
        int rows=twod.length;
        int cols=twod[0].length;
        int minc=s-1;
        int minr=s-1;
        int maxr=rows-s;
        int maxc=cols-s;
        int indx=0;
        for( int i=minr,j=minc; i<=maxr;i++){
            twod[i][j]=oned[indx];
            indx++;
        }
        minc++;
        for( int j=minc,i=maxr;j<=maxc;j++){
            twod[i][j]=oned[indx];
            indx++;
        }
        maxr--;
        for( int i=maxr,j=maxc; i>=minr;i--){
            twod[i][j]=oned[indx];
            indx++;
        }
        maxc--;
        for( int j=maxc,i=minr;j>=minc;j--){
            twod[i][j]=oned[indx];
            indx++;
        }
        minr++;

    }
    public static void rotate(int[] oned,int r){
        r=r%oned.length;
        if(r<0){
            r=r+oned.length;
        }

        reverse(oned,0,oned.length-1-r);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }
    public static void reverse(int[] onedarray,int left ,int right){
        while(left<right) {
            int temp = onedarray[left];
            onedarray[left] = onedarray[right];
            onedarray[right] = temp;
            left++;
            right--;
        }
    }
    public static void display(int[][] twod){
        for(int i=0;i<twod.length;i++){
            for ( int j=0;j<twod[0].length;j++){
                System.out.print(twod[i][j]+" ");
            }
            System.out.println();

        }
    }
}
