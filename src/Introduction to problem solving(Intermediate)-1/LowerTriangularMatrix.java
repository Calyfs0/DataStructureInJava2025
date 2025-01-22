public class LowerTriangularMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 0, 0},{0, 0, 0},{-7, -8, 9}};

        System.out.println(solve(A));
    }

    public static int solve(final int[][] A){
            int output = 0;

            for(int i=0;i<A.length;i++){
                for(int j=i+1;j<A[0].length;j++){
                    if(A[i][j]!= 0){
                        return output;
                    }
                }
            }

            output = 1;

            return output;
    }
}
