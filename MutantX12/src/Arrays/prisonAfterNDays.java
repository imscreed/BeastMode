package Arrays;

public class prisonAfterNDays {
    public static int[] prisonAfterNDays(int[] cells, int N) {
        if(cells.length == 0) return new int[] {};

        cells[0] = 0;
        cells[cells.length-1] = 0;

        while(N >= 0){
            for(int i = 1; i < cells.length-1; i++) {
                if((cells[i-1] == 0 && cells[i+1] ==0)
                        || (cells[i-1] == 1 && cells[i+1] == 1)) {
                    cells[i] = 1;
                } else {
                    cells[i] = 0;
                }

                System.out.println("Iteration: " + i + " N = " + N);
                System.out.print(cells[i-1] + " " + cells[i] + " " + cells[i+1]);
                System.out.println();
            }
            N--;
        }


        return cells;
    }

    public static void main(String[] args){
        int[] result = prisonAfterNDays(new int[] {0,1,0,1,1,0,0,1}, 7);

        for(int i = 0;i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
