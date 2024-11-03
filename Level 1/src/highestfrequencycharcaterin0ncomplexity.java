import java.util.*;
public class highestfrequencycharcaterin0ncomplexity {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
       String str= scn.nextLine();
       int[] farr=new int[26];
       for ( int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           int idx=ch-'a';
           farr[idx]++;
       }
       int max=0;
       for ( int i=0;i<farr.length;i++){
           if(farr[max]<farr[i]){
               max=i;
           }
       }
        char mfc =(char)(max+'a');
       System.out.println(mfc);

    }

}
