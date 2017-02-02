package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ibrahim on 2017-02-01.
 */
public class MergeTwoStringArrays {
    public static void main(String[] args) {

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        mergeArray(s1, s2);
    }
    public static void mergeArray(String[] s1, String[] s2){
        List list = new ArrayList(Arrays.asList(s1));
        list.addAll(Arrays.asList(s2));
        Object[] temp = list.toArray();
        System.out.println(Arrays.toString(temp));
    }
}
