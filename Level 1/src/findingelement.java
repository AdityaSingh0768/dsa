

import  java.util.*;
public class findingelement{
    public static void main (String[] args) {
        Scanner scn = new Scanner (System.in); {
            int n=scn.nextInt();
            int []arr= new int [n];
            for( int i=0;i<arr.length;i++){
                arr[i] =scn.nextInt();
            }
            int foundat =-1;
            int item=scn.nextInt();

                for(int i=0;i<arr.length;i++){
                    if(arr[i]==item){
                         foundat =i;
                        break;
                    }
                }
                System.out.println(foundat);
        }
    }
}
