package Functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        Hello h = System.out::println;
        h.log("Test");

        Divisible d = x -> {
            if(x % 2 == 0){
                System.out.println("Yes it is Divisible");
            } else{
                System.out.println("No, not Divisible");
            }
        };
        d.check(3);

        Demo ds = new Demo() {
            @Override
            public void demo1() {
                System.out.println("Hello from Demo1");
            }
        };

        ds.demo1();
        ds.demo();

        //No need to instantiate the interface
        StatDemo.demo2();

        //Check if string is in the array of given strings

        System.out.println(ChkStr(new String[]{"hello", "net", "world", "www"}, "net"));

        findCommon(Arrays.asList(1, 2, 3, 2, 5), Arrays.asList(2, 5, 6, 7, 8));

    }

    private static boolean ChkStr(String[] arr, String s){

        List<String> strList = Arrays.asList(arr);

        System.out.println(strList.stream().filter(x -> !x.equals(s)).collect(Collectors.toList()));
        return strList.stream()
                .anyMatch(x -> x.equals(s));

    }

    private static void findCommon(List<Integer> a, List<Integer> b){
        List<Integer> ab = a.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ab);
    }

    interface Greet {
        void greet(String message);
    }
    interface Calculate {
        int compute(int a, int b);
    }

    interface Hello {
        void log(String s);
    }

    interface Divisible{
        void check(int x);
    }

    //Default and Static Methods in Interface
    interface Demo {
        void demo1();
        default void demo() {
            System.out.println("Default method");
        }
    }

    interface StatDemo {
        static void demo2() {
            System.out.println("Hello from Static Method");
        }
    }
}
