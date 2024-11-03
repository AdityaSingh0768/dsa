import java.util.*;
public class sortlohigh{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr=  new int[n];
        for ( int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int lo= scn.nextInt();
        int hi= scn.nextInt();
        // 0 to j-1 all zereos
        // j to i-1 all ones
        // k+1 to end all twos
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(i<=k){
            if((arr[i]>=lo)&&(arr[i]<=hi)){ // isme lower no ka order preserve nhi rehta
                i++;

            }else if(arr[i]<lo){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;

            }else if (arr[i]>hi){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
            }
        } for ( int z=0;z<arr.length;z++) {
            System.out.print(arr[z]+" ");
        }
    }

}

