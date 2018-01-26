package DataStructures;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args){
        //PriorityQueue is the implementation of a min Heap
        PriorityQueue<Integer> orders = new PriorityQueue<>();
//        orders.add(1);
        orders.add(5);
        orders.add(2);
        orders.add(5);
        orders.add(3);
        orders.add(4);
        System.out.println(orders.peek());
    }
}
