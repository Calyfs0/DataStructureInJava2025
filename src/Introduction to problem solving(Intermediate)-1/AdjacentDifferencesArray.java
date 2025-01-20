import java.util.Arrays;

public class AdjacentDifferencesArray {
    public static void main(String[] args) {
        int[] A = {6,2,4,4,3};
        int[] output = solve(A);
        System.out.println(Arrays.toString(output));
        //Arrays.stream(output).forEach(System.out::println);
    }

    public static int[] solve(int[] input){
        if (input.length == 1){
            return new int[]{};
        }
        int[] output = new int[input.length-1];

        for(int i=0;i<input.length-1;i++){
            output[i] = input[i+1] - input[i];
        }
        return output;
    }
}
