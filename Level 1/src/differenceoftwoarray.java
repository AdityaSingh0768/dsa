import  java.util.Scanner;
public class differenceoftwoarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        {
            int n1 = scn.nextInt();
            int[] one = new int[n1];
            for (int i = 0; i < one.length; i++) {
                one[i] = scn.nextInt();
            }
            int n2 = scn.nextInt();
            int[] two= new int[n2];
            for (int i = 0; i < two.length; i++) {
                two[i] = scn.nextInt();
            }
            int[] diff=new int[n2];
            int i=one.length-1;
            int j=two.length-1;
            int k=diff.length-1;
            int c=0;
            while(k>=0){
                int d=two[j]-c;
                if(i>=0){
                    d=d-one[i];
                }
                if(d<0){
                    d=d+10;
                    c=1;
                }else {
                    c=0;
                }
                diff[k]=d;
                i--;
                j--;
                k--;
            } int indx=0;
            while (indx<diff.length) {
                if(diff[indx]!=0) {
                    break;
                }else {
                    indx++;
                }
            }
            for(int x=indx;x<diff.length;x++) {
                System.out.println(diff[x]);
            }
        }
    }
}
