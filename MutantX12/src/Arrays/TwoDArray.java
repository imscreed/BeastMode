package Arrays;

/**
 * Created by Ibrahim on 2017-06-13.
 */
public class TwoDArray {
    public static void main(String[] args){
        int a[][] = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        System.out.println(a.length);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
