import java.util.*;
public class printmazepathusingrecursiononthewayup {
    public static void main(String[]  args){
        Scanner scn = new Scanner (System.in);
        int dr=scn.nextInt();
        int dc= scn.nextInt();
        Printmazepath(dr,dc,1,1,"");
    }
    public static  void  Printmazepath(int dr, int dc, int sr,int sc,String psf  ){
        if(sr>dr||sc>dc){
       return;
        }else if ( sr==dr&&sc==dc){
            System.out.println(psf);
            return ;
        }
        Printmazepath(dr,dc,sr,sc+1,psf+"h");
        Printmazepath(dr,dc,sr+1,sc,psf+"v");

    }
}
