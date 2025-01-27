/*
 * Problem Description

You are given a constant array A.

You are required to return another array which is the reversed form of the input array.



Problem Constraints

1 <= A.size() <= 10000

1 <= A[i] <= 10000



Input Format

First argument is a constant array A.



Output Format

Return an integer array.



Example Input

Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output

Output 1:

 [1,2,3,2,1] 
Output 2:

 [10,1,1] 


Example Explanation

Explanation 1:

Reversed form of input array is same as original array
Explanation 2:

Clearly, Reverse of [1,1,10] is [10,1,1]
 */

import java.util.Arrays;

public class ReverseTheArrayUsingXor {
    public static void main(String[] args) {
        int[] A = {1,1,10};
        System.out.println(Arrays.toString(solve(A)));
        
    }

    public static int[] solve(int[] A){
        
        int[] output = A.clone();

        int i = 0;
        int j = output.length - 1;


        while(i < j){
            output[i] = output[i] ^ output[j];
            output[j] = output[i] ^ output[j];
            output[i] = output[i] ^ output[j];
            i++;
            j--;
        }

        return output;
    }
}
