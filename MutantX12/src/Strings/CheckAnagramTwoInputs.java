package Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-30.
 */
public class CheckAnagramTwoInputs {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String in1 = in.next();
        String in2 = in.next();
        System.out.println(checkAnagram(in1, in2) ? "Anagram" : "Not Anagram");
    }
    private static boolean checkAnagram(String in1, String in2){
        boolean result;
        //This will ignore any case
        in1.toLowerCase();
        in2.toLowerCase();
        if(in1.length() != in2.length()){
            result = false;
        } else{
            char[] a = in1.toCharArray();
            //We can sort any array using Arrays.sort
            Arrays.sort(a);
            char[] b = in2.toCharArray();
            Arrays.sort(b);
            //Very useful for checking the equality of two arrays
            result =  Arrays.equals(a, b);
        }
        return result;
    }
}
