import java.util.Arrays;

public class MultipleLeftRotations {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int B[] = {2,3};

        int[][] output = solve(A, B);
        for(int[] x : output){
            System.out.println(Arrays.toString(x));
        }
        
    }

    public static int[][] solve(int[]A, int[] B){
        int rows = B.length;
        int cols = A.length;
        int[][] output = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            int rotation = B[i];

            rotation %= cols;

            int[] rotatedArray = new int[cols];
            for(int j=0;j<cols;j++){
                int index = (rotation + j)%cols;
                rotatedArray[j] = A[index];
            }

            output[i] = rotatedArray;
        }

        return output;
        
    }
}
