package Strings;

import java.util.*;

/**
 * Created by Ibrahim on 2017-01-30.
 */
public class LexographicalSubstringsInWord {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int n = in.nextInt();
        List<String> sub = new LinkedList<String>();
        for(int i=0;i<word.length()-(n-1);i++){
            sub.add(word.substring(i, i+n));
        }
        System.out.println(sub);
        //Collections are used here to get the min and max
        System.out.println(Collections.min(sub));
        System.out.println(Collections.max(sub));
    }
}
