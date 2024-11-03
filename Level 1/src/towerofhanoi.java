import java.util.*;
public class towerofhanoi {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int t1id=scn.nextInt();
        int t2id=scn.nextInt();
        int t3id=scn.nextInt();
        TOH(n,t1id,t2id,t3id);
    }
    // exp= TOH(3,A,B,C)=IT is supposed to print valid instruction to move 3 disc from tower Ato B using tower C
    //faith 1=TOH(2,A,C,B)=it will print all valid instruction to move n-1 disc from tower Ato C using  tower  B
    //faith 2= TOH(2,C,B,A)=IT will print all valid instruction to move n-1 disc from tower C to A using tower B
    public static void TOH(int n,int t1id,int t2id,int t3id) {
        if(n==0){
            return ;
        }
        TOH(n-1,t1id,t3id,t2id);//t1 has one disc ,t2 is empty,t3 has n-1 disc
        System.out.println(n+"["+t1id+"->"+t2id+"]");//t1 is empty ,t2 has one disc ,t3 has n-1 disc
        TOH(n-1,t3id,t2id,t1id);//t1 is empty ,t3 ia empty ,t2 has all the disc

    }
}


