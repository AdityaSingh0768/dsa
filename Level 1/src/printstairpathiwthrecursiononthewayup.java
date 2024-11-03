import java.util.*;
public class printstairpathiwthrecursiononthewayup {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=  scn .nextInt();
         printstairpaths(n,"");
    }
    public static void printstairpaths( int n , String path){
        if(n==0){
            System.out.println(path);
            return;
        }else if(n<0) {
//            System.out.print("_");( negative answer ko print nhi krte )
            return ;
        }
                   printstairpaths(n-1,path+"1");
                   printstairpaths(n-2,path+"2");
                   printstairpaths(n-3,path+"3");

    }
    
}
