package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-06-12.
 */

/*You are given two arrays A and B each containing  integers. You need to choose exactly 1 number from A and exactly 1
number from B such that the index of the two chosen numbers is not same and the sum of the 2 chosen values is minimum.

Your objective is to find and print this minimum value.

*/

//Input1: Size of two arrays
//Input2: Array A
//Input3: Array B

public class SumOfMinimumOf2Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            arr2[i] = sc.nextInt();
        }

        //Convert int[] to Integer[] to perform sorting
        Integer[] arr1_Integer = Arrays.stream( arr1 ).boxed().toArray( Integer[]::new );
        Integer[] arr2_Integer = Arrays.stream( arr2 ).boxed().toArray( Integer[]::new );
        Arrays.sort(arr1_Integer);
        Arrays.sort(arr2_Integer);


        //Sort integer in descending order
//        Comparator<Integer> c = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        };
//        Arrays.sort(arr2_Integer, c);

        //Make sure the index of the two chosen numbers are not same
        if(Arrays.asList(arr1).indexOf(arr1_Integer[0]) != Arrays.asList(arr2).indexOf(arr2_Integer[0])){
            System.out.println(arr1_Integer[0]+arr2_Integer[0]);
        } else{
            if(arr2_Integer[1] < arr1_Integer[1]){
                System.out.println(arr2_Integer[1]+arr1_Integer[0]);
            } else{
                System.out.println(arr1_Integer[1]+arr2_Integer[0]);
            }
        }
    }
}
