package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-02-05.
 */
public class DynamicArrayListPositionLocator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<int[]> arr_list = new ArrayList<int[]>();
        for(int i=0;i<n;i++){
            int entries = in.nextInt();
            int[] arr = new int[entries];
            for(int j=0;j<entries;j++){
                arr[j] = in.nextInt();
            }
            arr_list.add(arr);
        }
        Iterator it = arr_list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(arr_list);
    }
}
