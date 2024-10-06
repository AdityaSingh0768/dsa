import java.util.*;
public class asciidifference{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s= scn.nextLine();
        String w=solution(s);
        System.out.print(w);
    }
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++) {
            if(i==s.length()-1){
                char chi=s.charAt(i);
                sb.append(chi);
            }else {
                char chi=s.charAt(i);
                char chip1=s.charAt(i+1);
                sb.append(chi);
                sb.append(chip1-chi);
            }
        }
        return sb.toString();
    }
}

