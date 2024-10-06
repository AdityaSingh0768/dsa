import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;
        while (temp != 0){
            temp = temp / 10;
        nod++;
    }
//        }System.out.println(nod);
            int div = 1;
            int mul = 1;
            k=k%10;
            if(k<0){
                k=nod+k;
            }
//            kewal remainder baar hi rorate  krna hota h;
            for (int i = 1; i <= nod; i++) {
                if (i <= k) {
                    div = div * 10;
                } else {
                    mul = mul * 10;
                }
            }
//        System.out.println(div);
//        System.out.println(mul);
            int q = n / div;
            int rem = n % div;
            int ans = rem * mul + q;
            System.out.println(ans);
        }
    }

