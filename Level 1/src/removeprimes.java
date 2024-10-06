import java.io.*;
import java.util.*;
public class removeprimes {
    public static void main( String[] args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        ArrayList<Integer>al= new ArrayList<>();
        for( int i=0;i<n;i++){
            int m= scn.nextInt();
            al.add(m);
        }solution(al);
        System.out.print(al);
    }
    public static void solution(ArrayList<Integer> al){
        for( int i=0;i<al.size();i++){
             int val=al.get(i);
             boolean isthisvalueprime=isprime(val);
             if(isthisvalueprime==true){
                 al.remove(i);
                 i--;
             }

        }
    }
    public static boolean isprime( int val){
        boolean  isprime=true;
        for( int div=2;div*div<=val;div++){
            if(val%div==0){
                isprime=false;
                break ;
            }
        }
        return isprime;

    }
}
