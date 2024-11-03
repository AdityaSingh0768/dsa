import java.util.*;
public class Printmazepathwithmultiplejumps {
    public static void main(String[]  args){
        Scanner scn = new Scanner (System.in);
        int dr=scn.nextInt();
        int dc= scn.nextInt();
        Printmazepathwithjumps(dr,dc,1,1,"");
    }
    public static  void  Printmazepathwithjumps(int dr, int dc, int sr,int sc,String psf  ){
        if(sr>dr||sc>dc){
            return;
        }else if ( sr==dr&&sc==dc){
            System.out.println(psf);
            return ;
        }
           for ( int hjumps=1;hjumps<=dc-sc;hjumps++) {
               Printmazepathwithjumps(dr, dc, sr, sc + hjumps, psf + "h"+hjumps);//horizontal jump  column changes
           }
        for ( int vjumps=1;vjumps<=dr-sr;vjumps++) {
            Printmazepathwithjumps(dr, dc, sr + vjumps, sc, psf + "v"+vjumps);//vertical jump  row changes
        }
        for ( int djumps=1;(djumps<=Math.min(dc-sc,dr-sr)||djumps<=dc-sc&&djumps<=dr-sr);djumps++) {
            Printmazepathwithjumps(dr, dc, sr +djumps, sc + djumps, psf + "d"+djumps);//daigonal jump ki range minimum hoti h horizotanl aur vertical jump me sein
        }

    }
}