/*
 * Q2. Primal Power

Problem Description

"Primal Power" of an array is defined as the count of prime numbers present in it.

Given an array of integers A of length N, you have to calculate its Primal Power.



Problem Constraints

1 <= N <= 103

-106 <= A[i] <= 106



Input Format

First and only argument is an integer array A.



Output Format

Return the Primal Power of array A.



Example Input

Input 1:

 A = [-6, 10, 12]
Input 2:

 A = [-11, 7, 8, 9, 10, 11]


Example Output

Output 1:

 0
Output 2:

 2

 Example Explanation

Explanation 1:

 -6 is not a prime number, as prime numbers are always natural numbers(by definition). 
  Also, both 10 and 12 are composite numbers.
Explanation 2:

 7 and 11 are prime numbers. Hence, Primal Power = 2.
 */

public class PrimalPower {
    public static void main(String[] args) {
        int[] A = {-11, 7, 8, 9, 10, 11};
        System.out.println(CalculatePrimalPower(A));
    }

    public static int CalculatePrimalPower(int[] A){
        int primalPower = 0;

        for(int i=0;i<A.length;i++ ){
            if(A[i] > 1 && IsPrime(A[i])){
                System.out.println(A[i]);
                primalPower++;
            }
        }

        return primalPower;
    }

    public static boolean IsPrime(int A){
            int i = 2;
            while(i <= Math.sqrt(A)){
                if(A%i == 0) return false;
                i++;
            }

            return true;

    }
}
