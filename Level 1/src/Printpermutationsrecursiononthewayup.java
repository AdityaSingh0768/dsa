import java.util.*;
public class Printpermutationsrecursiononthewayup {
    public static void main(String[]  args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printpermutation(str, "");
    }
    public static void printpermutation( String str ,String asf){
        if(str.length()==0){
            System.out.println(asf);
        }
        for( int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String prei=str.substring(0,i);
            String posti=str.substring(i+1);
            String newstring=prei+posti;
            printpermutation(newstring,asf+ch);
           
        }
    }

}

