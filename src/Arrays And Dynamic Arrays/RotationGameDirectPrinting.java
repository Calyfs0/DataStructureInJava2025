/*
 * Problem Description

Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.


Problem Constraints

1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109


Input Format

There are 2 lines in the input

Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.

Line 2: A single integer B.


Output Format

Print array A after rotating it B times towards the right.


Example Input

Input 1 :
4 1 2 3 4
2


Example Output

Output 1 :
3 4 1 2
 */

 public class RotationGameDirectPrinting {
     
     public static void main(String[] args) {
         int[] A = {1, 2, 3, 4};
         int B = 9;
         int N = A.length;

         /*  To limit the rotation in between the array length as it will be repetitive
                For example:
                for B = 5, after 4 rotations array will be the same. So eventually we will be rotating only 1 time. That is why B%N i.e. 5%4 = 1         
         */
         B = B%N;
         
         for(int i=0;i<A.length;i++){
             int index = (A.length - B + i)%A.length;
             System.out.println(A[index]);
         }
     }
 }
 