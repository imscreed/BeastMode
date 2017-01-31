package Important;

/**
 * Created by Ibrahim on 2017-01-29.
 */
public class VariableArguments {
    static void va(int...v){
        for(int i: v){
            System.out.print(i+" ");
        }
        System.out.println("Va Executed");
    }

    public static void main(String args[]){
        va(1,2);
        va(12,345,345,33);
        va();
    }
}
