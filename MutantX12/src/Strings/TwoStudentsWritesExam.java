package Strings;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-06-20.
 */

/*Input Format
The first line contains a single integer n, the number of questions.
The second line contains a string of length n denoting the answers of Vincent.
The third line contains a string of length n denoting the answers of Catherine.
*/
public class TwoStudentsWritesExam {

    static int maxScoreOfVincent(int n, String s, String t) {
        //Rule:1 - If the characters are same in the same index then don't count, else count if different
        int count = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i) != '.')
                    count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String t = in.next();
        int result = maxScoreOfVincent(n, s, t);
        System.out.println(result);
    }
}
