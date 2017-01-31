package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Ibrahim on 2017-01-31.
 */

//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
//Compile the given regex to see if the syntax of regex is correct

public class PatternMatcher {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=0;i<n;i++){
            String pattern = in.nextLine();
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){ //this exception will be called whenever the pattern compilation fails due to bad syntax in regex
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}
