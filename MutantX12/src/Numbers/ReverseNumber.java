package Numbers;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-02-01.
 */
public class ReverseNumber{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            int r=0;
            while(n!=0){
                r = r * 10;
                r= r+(n%10); //To get the last digit use %
                n = n/10; //To get the number except the last digit use /
            }
            System.out.println(r);
        }
}
