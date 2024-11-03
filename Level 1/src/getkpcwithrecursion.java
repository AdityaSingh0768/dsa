import java.util.*;
public class getkpcwithrecursion {
    public static void main( String[]  args){
        Scanner scn = new Scanner (System.in);
        String str= scn.nextLine();
        ArrayList<String> ss = getKPC(str);
        System.out.print(ss);
    }
    public  static  String[]  codes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};
   public static ArrayList<String> getKPC(String str){
       if(str.length()==0){
           ArrayList<String> bres= new ArrayList<>();
           bres.add("");
           return bres;
       }
      char  ch = str.charAt(0);//3
       String ros =str.substring(1);//67
       ArrayList<String> rres= getKPC(ros);// all possbile outcome from 67
       ArrayList<String> mres= new ArrayList<>();
      int ii=ch-48;
      String code=codes[ii];
      for( int i=0;i<code.length();i++){
          char chi=code.charAt(i);
          for( String rstr:rres){
              mres.add(chi+rstr);
          }
      }
      return mres;
   }
}
