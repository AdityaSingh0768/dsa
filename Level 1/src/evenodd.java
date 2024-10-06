import java.util.*;
public class evenodd {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int num= scn.nextInt();
        int p=1;
        while(p<=num){
            if(p%2==0){
                System.out.println(p+"iseven");
            }else {
                System.out.println(p+"isodd");
            }
            p++;
        }
    }

}
