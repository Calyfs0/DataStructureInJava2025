import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesUsingHashMap {
    public static void main(String[] args) {
        int[] A = {1, 10, 20, 1, 25, 1, 10, 30, 25, 1};
        int output = solve(A);

        System.out.println(String.format("No of repetitive elements: %s",output));
    }

    public static int solve(int[] A){
        int noOfDuplicates = 0;
        HashMap<Integer,Integer> occurances = new HashMap<>();

        for(int i = 0;i < A.length;i++){
            int val = occurances.getOrDefault(A[i], 0);
            occurances.put(A[i],val+1);

        }

        for(int value : occurances.values()){
            if(value > 1){
                noOfDuplicates += value -1;
            }
        }
        return noOfDuplicates;
    }
}
