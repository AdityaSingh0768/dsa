import java.util.*;
public class printkpcrecursiononnthewayup {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        String str= scn.nextLine();
        printKPC(str,"");
    }
   public static  String[] arr= {";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String s,String asf){
        if(s.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = s.charAt(0);
        s=s.substring(1);
        String tobeexpressed=arr[ch-'0'];
        for( int i=0;i<tobeexpressed.length();i++){
            char choices= tobeexpressed.charAt(i);
            printKPC(s,asf+choices);
        }
        //for(char choices:tobeexpressed){
       // printKPC(s,asf+choices);



    }
}
