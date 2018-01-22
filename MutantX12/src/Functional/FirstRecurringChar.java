package Functional;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstRecurringChar {
    public static void main(String[] args){
        checkUsingStream("BCABBCCCAC");
    }
    private static void check(String a){
        char[] b = a.toCharArray();
        List<Character> charlist = new ArrayList<>();
        for(int i = 0; i<b.length; i++){
            if(!charlist.contains(b[i])) charlist.add(b[i]);
            else {
                System.out.println(b[i]);
                break;
            }
        }
    }

    private static void checkUsingStream(String a){
        char[] as = a.toCharArray();
        List<Character> b = new LinkedList<Character>();
        List<Character> flist = new ArrayList<>();
        for(int i=0;i<as.length;i++) b.add(as[i]);
//        b.forEach(System.out::println);
        b.stream().filter(x -> {
            if(!flist.contains(x)) {
                flist.add(x);
                return false;
            }
            return true;
        })
                .findFirst()
                .ifPresent(System.out::println);


    }

}
