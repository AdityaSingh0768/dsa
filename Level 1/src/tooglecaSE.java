import java.util.*;
public class tooglecaSE {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s= scn.nextLine();
        String w=togglecase(s);
        System.out.print(w);
        }
        public static String togglecase(String s){
        StringBuilder sb = new StringBuilder(s);
        for( int i=0;i<sb.length();i++){
            char ch =sb.charAt(i);
            if( ch>='A'&& ch<='Z'){
              char lc=(char)(ch+'a'-'A');// (char) isliye use kiya h jisse wo wapis charcater me change ho jaye 
              sb.setCharAt(i,lc);
            }else {
                char uc=(char)(ch+'A'-'a');
                sb.setCharAt(i,uc);
            }
        }

        return   sb.toString();

    }
}
