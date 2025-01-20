public class AddBinaryStrings {
    
    public static void main(String[] args) {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";
        
        
        String output = addBinary(A,B);

        System.out.println(output);
    }

    public static String addBinary(String A, String B){
        StringBuilder sb = new StringBuilder("");

        int lengthA = A.length() - 1;
        int lengthB = B.length() - 1;

        int sum = 0;
        int carry = 0;

        while(lengthA >=0 || lengthB >= 0){
            sum = carry;

            if(lengthA>=0){
                sum += A.charAt(lengthA) - '0';
                lengthA--;
            }
                
            if(lengthB>=0){
                sum += B.charAt(lengthB) - '0';
                lengthB--;
            }
            
            carry = sum/2;
            sum = sum%2;

            sb.insert(0,Integer.toString(sum));
            
            
        }
        
        if(carry == 1){
            sb.insert(0,Integer.toString(carry));
        }
        
        return sb.toString();
        
    }
}
