import java.util.*;
public class getmazepathwithrecursion {
    public static void main( String[]  args){
        Scanner scn = new Scanner (System.in);
        int row=scn.nextInt();
        int cols=scn.nextInt();
        ArrayList<String> ss = getmazepath(1,1,row,cols);
        System.out.print(ss);
    }

    public static ArrayList<String> getmazepath(int srr,int src,int desr, int desc){
        if(srr>desr||src>desc){
            ArrayList<String> bres= new ArrayList<>();
            return bres;
        }else if(srr==desr||src==desc) {
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String>mypaths=new ArrayList<>();
        ArrayList<String>myhpaths= getmazepath(srr,src+1,desr,desc);
        ArrayList<String>myvpaths= getmazepath(srr+1,src,desr,desc);

        for( String myhpath:myhpaths){
            mypaths.add("h"+myhpath);
        }
        for( String myvhpath:myvpaths){
            mypaths.add("v"+myvhpath);
        }

        return mypaths;
    }
}
