package Strings;

import javafx.util.converter.CharacterStringConverter;

import java.util.*;

/**
 * Created by Ibrahim on 2017-02-01.
 */
public class ReverseString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String result = method2(word);
        System.out.println(result);

    }
    //Convert the string into Characters -> LinkedList -> Use Collections to reverse -> LinkedList to String
    public static String method1(String word){
        char[] ch = word.toCharArray();
        List<Character> wc = new LinkedList<Character>();
        for(int i=0;i<word.length();i++)
            wc.add(ch[i]);
        Collections.reverse(wc);
        String result = new String();
        for(char c:wc)
            result+=c;
        return result;
    }
    //Usual
    public static String method2(String word){
        char[] ch = word.toCharArray();
        String result = new String();
        for(int i=ch.length-1;i>=0;i--)
            result+=ch[i];
        return result;
    }

}
