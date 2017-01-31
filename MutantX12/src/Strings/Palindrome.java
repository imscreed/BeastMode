package Strings;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-30.
 */
public class Palindrome {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String msg = in.next();
        char a[] = msg.toCharArray();
        String rev="";
        for(int i=a.length-1;i>=0;i--){
            rev += a[i];
        }
        System.out.println(rev);

        //compareTo can also be implemented by checking the result ==0
        if(rev.equals(msg)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
