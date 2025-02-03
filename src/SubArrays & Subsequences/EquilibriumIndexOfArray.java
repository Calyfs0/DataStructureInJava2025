/*
 * Problem Description

You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.




Problem Constraints

1 <= N <= 105
-105 <= A[i] <= 105


Input Format

First arugment is an array A .


Output Format

Return the equilibrium index of the given array. If no such index is found then return -1.


Example Input

Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]
Input 2:

A = [1, 2, 3]


Example Output

Output 1:
3
Output 2:

-1


Example Explanation

Explanation 1:
i   Sum of elements at lower indexes    Sum of elements at higher indexes
0                   0                                   7
1                  -7                                   6
2                  -6                                   1
3                  -1                                  -1
4                   1                                   3
5                  -3                                   0
6                   0                                   0

3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */

public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        int[] A = {1,2,3,7,1,2,3};
        System.out.println(solve(A));
    }

    public static int solve(int[] A){
      
        //creating prefix sum array
        int[] forwardPrefixSum = new int[A.length+1];
        forwardPrefixSum[0] = 0;
        int L = forwardPrefixSum.length;
        for(int i=1;i<L;i++){
            forwardPrefixSum[i] = A[i-1] + forwardPrefixSum[i-1];
        }

        for(int i=1;i<L;i++){
            if(forwardPrefixSum[i] == forwardPrefixSum[L - 1] - forwardPrefixSum[i-1]){
                return i-1;
            }
        }

        return -1;
    }
}
