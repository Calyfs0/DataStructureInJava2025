package SubArrays;

public class SpecialSubsequencesAG {
    public static void main(String[] args) {
        String A = "ABCGAG";

        System.out.println(solve(A));
    }

    public static int solve(String A){
        
        int L = A.length();
        int GCount = 0;
        int ans = 0;
        int mod = 1000000007;

        
        for(int i = L-1;i>=0;i--){
            if(A.charAt(i) == 'G'){   //Calculating from end of string the occurances of G
                GCount = GCount + 1;
            }
            
            else if(A.charAt(i) == 'A'){ // If a 'A' occurs, it will have as many subsequences 'AG' occurances as there are G currently counted
                ans += GCount;
                ans = ans%mod;
            }
        }

        return ans%mod;


    }
}
