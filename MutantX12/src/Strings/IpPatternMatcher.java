package Strings;

import java.util.Scanner;
//http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
/**
 * Created by Ibrahim on 2017-01-31.
 */
public class IpPatternMatcher {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex {
    String pattern = "((([0-9]{1,2})|([0-1]{1}[0-9]{1,2})|([2]{1}[0-5]{2}))([.]{1})){3}(([0-9]{1,2})|([0-1]{1}[0-9]{1,2})|([2]{1}[0-5]{2})){1}";
}
