 import java.util.*;
 public class printsubsequemnceonthewayup {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        String s= scn.nextLine();
        printSS(s,"");

    }
    public static void printSS(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        s=s.substring(1);
        printSS(s,ans+ch);//selection
        printSS(s,ans);// rejection

    }
}
