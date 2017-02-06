package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-02-01.
 */
public class SumOfNegativeSubArrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        in.close();
        List<Integer> all_sum = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++) {
                System.out.println("");
                sum = 0;
                for(int k=i;k<=j;k++) {
                    System.out.print(a[k] + " ");
                    sum += a[k];
                }
                if(sum!=0) {
                    System.out.print(" " + sum + " ");
                    all_sum.add(sum);
                }
                if(sum<0){
                    count++;
                }

            }

        }
        System.out.println("\nList containing sum of all sub arrays: "+all_sum);
        System.out.println("Number of negative sub arrays sums:" + count);
    }
}
