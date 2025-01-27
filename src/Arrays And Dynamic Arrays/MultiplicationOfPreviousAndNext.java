/*
 * Q1. Multiplication of previous and next

Given an array of integers A, update every element with multiplication of previous and next elements with following exceptions. a) First element is replaced by multiplication of first and second. b) Last element is replaced by multiplication of last and second last.


Input Format

The only argument given is the integer array A.
Output Format

Return the updated array.
Constraints

1 <= length of the array <= 100000
-10^4 <= A[i] <= 10^4 
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [2, 3, 8, 15, 20]

Input 2:
    A = [5, 17, 100, 11]
Output 2:
    [85, 500, 187, 1100]


 */

import java.util.Arrays;

public class MultiplicationOfPreviousAndNext {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] output = solve(A);

        System.out.println(Arrays.toString(output));

    }

    public static int[] solve(int[] A){
        if(A.length == 1) return A;
        int N = A.length;
        int lastIndex = N - 1;
        int[] output = new int[N];

        output[0] = A[0] * A[1];

        output[lastIndex] = A[lastIndex] * A[lastIndex-1];

        for(int i=1;i<lastIndex;i++){
                output[i] = A[i-1] * A[i+1];
        }

        return output;
    }
}
