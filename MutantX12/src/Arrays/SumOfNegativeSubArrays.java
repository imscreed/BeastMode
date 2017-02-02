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
        List<Integer> subarr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            subarr.add(a[i]);
            for(int j=0;j<n;j++){
                subarr.add(a[i+1]+a[j]);
            }

        }
    }
}
