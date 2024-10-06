import java.util.*;

public class SBINTRO {
    public static void main ( String[]  args){

        StringBuilder sb = new StringBuilder("hello");
        char ch = sb.charAt(0);//to get character
        System.out.println(ch);
        sb.setCharAt(0,'b');//to change a charactet
        System.out.println(sb);
        sb.deleteCharAt(0);//to delete a character
        System.out.println(sb);
        sb.insert(3,'t');//to insert a character
        System.out.println(sb);
        String s= sb.toString();//to convert it into string again
        System.out.println(s);
    }
}
