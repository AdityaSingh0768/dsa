import java.util.*;
public class getstairpathusingrecursion {
    public static void main(String[] args){
    Scanner scn =  new Scanner (System.in);
    int n= scn.nextInt();
    ArrayList<String> paths= getstairpath(n);
    System.out.println(paths);
    }
    public static ArrayList<String> getstairpath( int n){
        if (n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }else  if (n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> pathsfromnm1=getstairpath(n-1);
        ArrayList<String> pathsfromnm2=getstairpath(n-2);
        ArrayList<String> pathsfromnm3=getstairpath(n-3);
        ArrayList<String> pathsfromn= new ArrayList<>();
         for (String pathfromnm1:pathsfromnm1){
             pathsfromn.add("1"+pathfromnm1);
         }
        for (String pathfromnm2:pathsfromnm2){
            pathsfromn.add("2"+pathfromnm2);
        }
        for (String pathfromnm3:pathsfromnm3){
            pathsfromn.add("3"+pathfromnm3);
        }
        return  pathsfromn;
    }


}
