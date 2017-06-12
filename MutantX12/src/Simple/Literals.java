package Simple;

/**
 * Created by Ibrahim on 2017-06-09.
 */

public class Literals {
    public static void main(String [] args){
        int a = 0xB;
        int better_readability = 123_234_2342; //the same can be applied to float too
        float b = 0.021f;
        int by = 323;
        char aa = 'a'; // or char aa = '\141';  //The ASCII value of a is 141
        aa++; //This will increment the ASCII value
        System.out.println("Printing the hex value of 0xB in Integer:"+a);
        System.out.println(better_readability);
        System.out.println(b);
        System.out.println(aa);
        System.out.println((byte) by); //Reduced modulo of 256, means 323%256 = 67
    }
}
