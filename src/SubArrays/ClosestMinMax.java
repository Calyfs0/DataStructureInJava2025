/*
 * Problem Description

Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints

1 <= |A| <= 2000



Input Format

First and only argument is vector A



Output Format

Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input

Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output

Output 1:

 2
Output 2:

 3


Example Explanation

Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.
 */


package SubArrays;

public class ClosestMinMax {
    public static void main(String[] args) {
        int[] A = {343,291,963,165,152};
        System.out.println(FindSubArray(A));
        
    }

    public static int FindSubArray(int[] A){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        int minLength = Integer.MAX_VALUE;

        //Calculate minimum and maximum values
        for(int i=0; i< A.length; i++){
            int val = A[i];
            max = Math.max(max,val);
            min = Math.min(min,val);
        }

        //Find the minimum length
        for(int j=0;j<A.length;j++){
            int currentVal = A[j];

            if(currentVal == min){
                minIndex = j;
            }

            if(currentVal == max){
                maxIndex = j;
            }

            if(minIndex!= -1 && maxIndex!= -1){
                int currentLength = Math.abs(maxIndex - minIndex) + 1;
                minLength = Math.min(minLength, currentLength);
            }
        }

        return minLength;


    }


}
