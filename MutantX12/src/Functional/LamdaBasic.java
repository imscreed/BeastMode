package Functional;

/**
 * Created by Ibrahim on 2017-06-12.
 */
public class LamdaBasic {

    public static void main(String[] args){
        Greet g1 = some_string -> System.out.println("Hello "+some_string);
        g1.greet("Ibrahim");

        Calculate add = (a, b) -> a + b; // You can also use curly braces and specigy that you are return a particular value
        System.out.println(add.compute(2, 3));

        Calculate sub = (x, y) -> x - y;
        System.out.println(sub.compute(4, 1));
    }

    interface Greet {
        void greet(String message);
    }
    interface Calculate {
        int compute(int a, int b);
    }
}
