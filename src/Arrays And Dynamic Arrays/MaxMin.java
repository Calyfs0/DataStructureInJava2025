import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] A ={5, 17, 100, 11};
        int B = 1;
        System.out.println(solve(A,B));
    }

    public static int solve(int[] A, int B){
        Arrays.sort(A);

        return A[A.length - B] - A[B-1];
    }
}
