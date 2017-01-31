package Important;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2017-01-29.
 */
public class StaticBlock {
    static int B, H;
    static boolean flag = false;

    //static block that uses static variables and static methods to perform computation
    static {
        Scanner one = new Scanner(System.in);
        B = one.nextInt();
        H = one.nextInt();
        if(B <= 0 || H <= 0){
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            flag = true;
        }
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
