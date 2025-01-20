public class ArrayWithConsecutiveElementUsingMinMax {
    public static void main(String[] args) {
        //int[] A = {3, 2, 6, 4, 5};
        int[] A = {1, 3, 2, 5};
        System.out.println(solve(A));
    }

    static int solve(int[] A){
        if(A.length == 1)
            return 1;
        int max = A[0];
        int min = A[0];

        for(int i : A){
            if(i > max){
                max = i;
            }
        }

        for(int i : A){
            if(i < min){
                min = i;
            }
        }

        int difference = max - min;

        if(difference != A.length - 1)
            return 0;
        

        for(int i=0;i<A.length;i++){
            int val = Math.abs(A[i]);
            int index = val - min;
            if(A[index] < 0) return 0;
            A[index] = A[index] * -1;
        }
        
        return 1;
    }
}
