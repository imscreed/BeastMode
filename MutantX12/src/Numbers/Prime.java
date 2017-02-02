package Numbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-31.
 */
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if(n.isProbablePrime(1)){
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }
    }
}
