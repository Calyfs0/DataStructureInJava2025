package LeetCode.Arrays.Easy;


public class RemoveDuplicatesFromSortedArray {
        public static void main(String[] args) {
            int[] nums = {1,1,2};

            int output = removeDuplicates(nums);
            System.out.println(output);
        }

        public static int removeDuplicates(int[] nums){
            int count = 1;
            int previous = nums[0];

            for(int i=1;i<nums.length;i++){
                if(nums[i] != previous){
                    previous = nums[i];
                    count++;
                }
            }

            return count;
        }
}
