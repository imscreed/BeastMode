package Strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-06-13.
 */

//Count the number of times a particular pattern occurs in a string.
//Eg: 1(0+)1 is the pattern.
//For example, consider string "1101001", we can see there are two consecutive sequences "1(0)1" and "1(00)1" which are of the form 1(0+)1.
public class PatternCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Get the number of strings that are going to undergo pattern matching
        int query = sc.nextInt();
        for(int i=1; i<=query; i++){
            String s = sc.next();
            int result = patternCount(s);
            System.out.println(result);
//            test(s);
        }
    }

    public static int patternCount(String s){
        char[] sub = s.toCharArray();
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0;i<sub.length;i++){
            if(sub[i] == '1'){
                //Store the index of the sub array that has '1's in indices list
                indices.add(i);
            }
        }
        int count = 0;
        //Check if the characters between the consecutive indexes in indices have the required pattern
        for(int i=0;i<indices.size()-1;i++){
            if(s.substring(indices.get(i), indices.get(i+1)+1).matches("(1)(0)+(1)")){
                count++;
                System.out.println(s.substring(indices.get(i), indices.get(i+1)+1));
            }
        }
        return count;
    }

    public static void test(String s){
        //This is not working if the pattern is 101001. The answer should be 2 but only one found
        String result = s.replaceAll("(1)(0)+(1)", "FU");
            System.out.println(result);
    }

}
