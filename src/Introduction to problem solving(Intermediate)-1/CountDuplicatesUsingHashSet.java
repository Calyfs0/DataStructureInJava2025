import java.util.HashSet;

public class CountDuplicatesUsingHashSet {
    public static void main(String[] args) {
        int[] A = {1, 10, 20, 1, 25, 1, 10, 30, 25, 1};
        int output = solve(A);
        System.out.println(output);

    }

    public static int solve(int[] A){
        int noOfDuplicates = 0;

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<A.length;i++){
            if(hs.contains(A[i])){
                noOfDuplicates++;
            }
            else{
                hs.add(A[i]);
            }
        }

        return noOfDuplicates;
    }
}
