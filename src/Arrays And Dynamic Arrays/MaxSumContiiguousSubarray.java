public class MaxSumContiiguousSubarray {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] A = {-163,-20};
        System.out.println(maxSubArray(A));
    }

    public static int maxSubArray(int[] A){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for(int i = 0;i<A.length;i++){
            currentSum += A[i];
            
            if(maxSum < currentSum){
                maxSum = currentSum;
                endIndex = i;
            }

            if(currentSum < 0){
                currentSum = 0;
                if(i < A.length - 1){
                    startIndex = i + 1;
                    endIndex = i + 1;
                }
                else{
                    startIndex = i;
                    endIndex = i;
                }
                
            }
        }

        //Calculated and printed index
        System.out.println("Start/End index of max sum contiguous array are: " + startIndex + ":" + endIndex    );
        return maxSum;
    }
}
