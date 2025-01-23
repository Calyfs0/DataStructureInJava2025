/*
 * Problem Description

Given a positive integer A, return an array of strings with all the integers from 1 to N. But for multiples of 3 the array should have “Fizz” instead of the number. For the multiples of 5, the array should have “Buzz” instead of the number. For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead of the number.

Look at the example for more details.



Problem Constraints

1 <= A <= 500000



Input Format

The first argument has the integer A.



Output Format

Return an array of string.



Example Input

Input 1:

 A = 5


Example Output

Output 1:

 [1 2 Fizz 4 Buzz]
 */

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int A = 15;
        String[] output = fizzBuzz(A);

        System.out.println(Arrays.toString(output));
    }

    public static String[] fizzBuzz(int A){
        String fizz = "Fizz";
        String buzz = "Buzz";
        String[] output = new String[A];
        for(int i=1;i<=A;i++){
            String s = "";
            if(i % 3 == 0){
                s += fizz;
            }
            if(i % 5 == 0){
                s += buzz;
            }

            output[i-1] = s == "" ?  Integer.toString(i) : s;
           
        }

        return output;
    }
}
