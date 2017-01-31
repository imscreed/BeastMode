package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Ibrahim on 2017-01-31.
 */
public class Tokenizer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        in.close();
        //demiliter with space and other symbols
        String delimiter = "[ !,?._'@]+";
        StringTokenizer tokenizer = new StringTokenizer(line, delimiter);
        System.out.println(tokenizer.countTokens());
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

        //Another implementation would to to split the string using the delimiters
//            String[] tokens = (line.trim().split(delimiter));
//            System.out.println(tokens.length);
//            for (int x = 0; x < tokens.length; x++) {
//                System.out.println(tokens[x]);
//            }
    }
}
