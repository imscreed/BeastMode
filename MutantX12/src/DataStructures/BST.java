package DataStructures;

import java.util.TreeMap;

public class BST {
    public static void main(String[] args){
        //TreeMap is an Red-Black implementation of a BST
        TreeMap<Integer, String> marks = new TreeMap<>();
        marks.put(50, "Jack");
        marks.put(49, "Sam");
        marks.put(100, "Lora");
        marks.put(99, "Fess");
        marks.put(47, "Temp");
        System.out.println(marks);
        System.out.println(marks.floorEntry(70));
    }
}
