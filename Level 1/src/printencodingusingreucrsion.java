import java.util.*;
public class printencodingusingreucrsion {
    public static void main(String[] args){
        Scanner scn =new Scanner (System.in);
        String str = scn.nextLine();
        printencoding(str,"");
        scn.close();

    }
    public static void printencoding(String str,String asf){
      if(str.length()==0){
      System.out.println(asf);
      return;
       }
      if(str.length()==1){
           String ch0=str.substring(0,1);// char at 0th index
           if(ch0.equals("0")){
               return ;
           }
          String roq0=str.substring(1); // string except first number
           int numforch0=Integer.parseInt(ch0);  // string number se integer mein convert krne ke liye
           String alphabetforch0 = (char) ('a' + numforch0 - 1) + "";// integer se char banane ke liye
           printencoding(roq0, asf + alphabetforch0);

      }
      else {

          String ch0=str.substring(0,1); // string except first number
          if(ch0.equals("0")){
              return;
          }
          String roq0=str.substring(1); //puri string excpet first integer
          int numforch0=Integer.parseInt(ch0);// string number se integer mein convert krne ke liye
          String alphabetforch0 = (char) ('a' + numforch0 - 1) + "";// integer se char banane ke liye
          printencoding(roq0, asf + alphabetforch0);


          String ch01=str.substring(0,2); // suru ke do character nikale string ki form se
          int numforch01=Integer.parseInt(ch01);// unhe integer mein convert kiya
          if(numforch01<=26) {
              String roq01 = str.substring(2);//purin string except suru ke 2
              String alphabetforch01 = (char) ('a' + numforch01 - 1) + "";// integer ko char mein convert krne ke liye
              printencoding(roq01, asf + alphabetforch01);
          }

      }
    }

}
