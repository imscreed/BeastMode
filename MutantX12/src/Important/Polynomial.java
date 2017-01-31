package Important;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-28.
 */
public class Polynomial {

        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                compute(a, b, n);
            }
            in.close();
        }

    private static void compute(int a, int b, int n){
        long sum=a;
        for(int j=0;j<=n-1;j++){
            sum = sum + (Math.round(Math.pow(2, j)*b));
            System.out.print(sum+" ");
        }
        System.out.print("\n");
    }

}

