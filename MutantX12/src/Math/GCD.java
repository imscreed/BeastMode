package Math;

import java.util.*;

public class GCD {
    public static void main(String[] args){
        System.out.println(computeGCD(new int[] {2, 3, 4, 5, 6}, 5));
        System.out.println(computeGCD(new int[] {4, 12, 16, 20, 24}, 5));
    }

    private static int computeGCD(int[] arr, int num){
        List<Integer> ref = new ArrayList<>();
        for(int i=2; i<=num; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] % i == 0){
                    count++;
                }else{
                    break;
                }
            }
            if(count == arr.length){
                ref.add(i);
            }
        }
        System.out.println(ref.toString());
        if(ref.isEmpty()) return 1;
        return Collections.max(ref);
    }
}
