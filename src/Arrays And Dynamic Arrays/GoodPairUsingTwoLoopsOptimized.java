/*
 * Problem Description

Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.



Problem Constraints

1 <= A.size() <= 104

1 <= A[i] <= 109

1 <= B <= 109



Input Format

First argument is an integer array A.

Second argument is an integer B.



Output Format

Return 1 if good pair exist otherwise return 0.



Example Input

Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4


Example Output

Output 1:

1
Output 2:

0
Output 3:

1
 */

public class GoodPairUsingTwoLoopsOptimized {
    public static void main(String[] args) {
        int[] A = {1,2,4};
        int B = 4;
        System.out.println(solve(A,B));
    }

    public static int solve(int[] A, int B){

        for(int i=1;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                if(A[j] + A[j-i] == B){
                    return 1;
                }
            }
        }
        return 0;
    }
}
