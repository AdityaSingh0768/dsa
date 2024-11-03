
import java.util.*;
public class printencodingusingrecursion {
    public static void main(String[]  args){
        Scanner scn = new Scanner (System.in);
        String str=scn.nextLine();
        printEncoding(str,"");
    }
    public static void printEncoding(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return ;
        }
        char ch1 = str.charAt(0);
        if (ch1 == 0) {
            return;
        }
        int num = ch1 - '0';// chratcer '' se integer me bdla
        char chtobeadded = (char) (num + 'a' - 1);  // integer ke corresponding variable me bdla
        printEncoding(str.substring(1), asf + chtobeadded);

        if (str.length() > 1) {
            char ch2= str.charAt(1);
            int num2=ch2-'0';//character se integer banayan
            int fnum=num2*10+num;
            if(fnum<=26) {// dono integer ko add kra
                char ch2tobeadded = (char) (fnum + 'a' - 1);//integer ke corresponding character ko find kra
                printEncoding(str.substring(2), asf + ch2tobeadded);

            }
        }
    }

}
