package Numbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-31.
 */
public class BigIntegers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(String.valueOf(in.nextBigInteger()));
        BigInteger b = new BigInteger(String.valueOf(in.nextBigInteger()));
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
