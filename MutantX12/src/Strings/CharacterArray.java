package Strings;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-30.
 */
public class CharacterArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
            System.out.println(A.length() + B.length());
            if(A.compareTo(B)<=0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
        char a = A.charAt(0);
        char b = B.charAt(0);
        System.out.println(Character.toUpperCase(a)+A.substring(1)+" "+Character.toUpperCase(b)+B.substring(1));
    }
}
