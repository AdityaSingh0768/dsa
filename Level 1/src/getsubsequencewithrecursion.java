import java.util.*;
public class getsubsequencewithrecursion {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        String str= scn.nextLine();
        ArrayList<String>ss=gss(str);
        System.out.print(ss);
    }
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres ;
        }
        char ch = str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres =gss(ros);
        ArrayList<String> mres=new ArrayList<>();
        for(String val:rres){
            mres.add(""+val);
        }
        for(String val:rres){
            mres.add(ch+val);
        }
        return mres;
    }


}
