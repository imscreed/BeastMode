package Strings;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-30.
 */
public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(substr(S, start, end));
    }
    private static String substr(String word, int start, int end){
        return word.substring(start, end);
    }
}
