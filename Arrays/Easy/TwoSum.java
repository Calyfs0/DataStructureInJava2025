import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {4,-2,5,0,6,3,2,7};
        int target = 1;
        int[] output = twoSumBest(nums, target);
        System.out.println(output.toString());

    }

    public int[] twoSum(int[] nums, int target){
        int arr[]=new int[2];
        int i,j;
        for(i=0;i<nums.length;i++){
            for (j =i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target ){
                    arr[0]=j;
                    arr[1]=j-i;
                     return arr;
                }
            }

        }

        return arr;
    }

    public static int[] twoSumWithExtraSpace(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int val = target - nums[i];

            if(map.containsKey(val)){
                return new int[]{map.get(val),i};
            }

            map.put(nums[i],i);
        }

        return new int[]{};
    }

    public static int[] twoSumBest(int[] nums, int target) {
        int arr[]=new int[2];
        int i,j;
        for(i=1;i<nums.length;i++){
             for(j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i]==target){
                    arr[0]=j;
                    arr[1]=j-i;
                     return arr;
                }
             }
        }
        return arr;
    }
    
}
