
/*
 * Problem Description
 
 Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
 
 NOTE: The rightmost element is always a leader.
 
 
 Problem Constraints
 
 1 <= N <= 105
 1 <= A[i] <= 108
 
 
 Input Format
 
 There is a single input argument which a integer array A
 
 
 Output Format
 
 Return an integer array denoting all the leader elements of the array in any order.
 
 
 Example Input
 
 Input 1:
  A = [16, 17, 4, 3, 5, 2]
 Input 2:
  A = [5, 4]
 
 
 Example Output
 
 Output 1:
 [17, 2, 5]
 Output 2:
 [5, 4]
 */

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> output = solve(A);
        System.out.println(output);
    }

    public static ArrayList<Integer> solve(int[] A){
        ArrayList<Integer> output = new ArrayList<>();

        int N = A.length;
        int max = A[N-1];
        output.add(max);
        for(int i=N-2;i>=0;i--){
            if(A[i] > max){
                max = A[i];
                output.add(max);
            }
        }

        return output;
    }
}
