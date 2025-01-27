/*
 * Problem Description

Given an array A of size N, find the subarray of size B with the least average.



Problem Constraints

1 <= B <= N <= 105
-105 <= A[i] <= 105


Input Format

First argument contains an array A of integers of size N.
Second argument contains integer B.


Output Format

Return the index of the first element of the subarray of size B that has least average.
Array indexing starts from 0.


Example Input

Input 1:
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
Input 2:

A = [3, 7, 5, 20, -10, 0, 12]
B = 2






Example Output

Output 1:
3
Output 2:

4
 */


public class SubArrayWithLeastAverage {
    public static void main(String[] args) {
        int[] A = {15,3,15,6,9,14,8,10,9,17};
        int B = 1;

        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B){
        int minSum = 0;
        
        for(int i=0;i<B;i++){
            minSum += A[i];
        }

        int startIndex = 0;
        int endIndex = B - 1;

        int indexWithLeastAverageSubarray = startIndex;
        int currentSum = minSum;
        while(endIndex < A.length - 1){
            endIndex++;
            currentSum = currentSum - A[startIndex] + A[endIndex];
            startIndex++;
            if(currentSum < minSum){
                minSum = currentSum;
                indexWithLeastAverageSubarray = startIndex;
            }
            
        }

        return indexWithLeastAverageSubarray;
    }
}
