import java.util.*;
public class stringcompression {
    public static void main(String[]  args){
        Scanner scn= new Scanner (System.in);
        String s=scn.nextLine();
           // personal approach for ( int j=1;j<s.length()-1;j++){
            //    if(s.charAt(j)!=s.charAt(j+1)){
              //      char f=s.charAt(j);
                //  System.out.print(f);
                //}
           // }
            //char ch =s.charAt(s.length()-1);
            //System.out.print(ch);
        String compression1=compression1(s);
        String compression2=compression2(s);
        System.out.print(compression1);
        System.out.print(compression2);


    }
    public static String  compression1(String s){
        String ans =" ";
        for( int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){

            }else
                ans=ans+s.charAt(i);
        }
        ans=ans+s.charAt(s.length()-1);
        return ans ;
    }
    public static String compression2(String s){
        String ans=" ";
           int c=1;
        for( int i=0;i<s.length()-1;i++){

            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }else {
                ans=ans+s.charAt(i);
                if(c>1){
                    ans=ans+c;
                    c=1;

                }
            }
        }
        ans=ans+s.charAt(s.length()-1);
        if(c>1){
            ans=ans+c;
        }

        return ans ;




    }



}
