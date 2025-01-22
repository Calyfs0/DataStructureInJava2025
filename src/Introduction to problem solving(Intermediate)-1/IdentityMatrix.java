public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] A = {{1,0},{0,1}};
        System.out.println(solve(A));
    }

    public static int solve(final int[][] A){
        int N = A.length;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i == j){
                    if(A[i][j] != 1){
                        return 0;
                    }
                } 
                else if(A[i][j]!= 0){
                    return 0;
                }
            }
        }


        return 1;
    }
}
