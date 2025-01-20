import java.util.Arrays;

public class ArrayWithConsecutiveElementUsingSorting {
    public static void main(String[] args) {
        //int[] A = {3, 2, 6, 4, 5};
        int[] A = {1, 3, 2, 5};
        System.out.println(solve(A));
    }


    public static int solve(int[] A){
        Arrays.sort(A);

        for(int i=1;i<A.length;i++){
            if(A[i] - A[i-1] != 1)
                return 0;
        }

        return 1;
    }
}
