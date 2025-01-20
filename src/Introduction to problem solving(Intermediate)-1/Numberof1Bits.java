public class Numberof1Bits {

    public static void main(String[] args){
        int input = 6;
        int output = numSetBits(input);

        System.out.println(output);
    }

    public static int numSetBits(int A){
            int numberOfSetBits = 0;
            if(A == 1){
                return 1;
            }
            while(A > 0){
                int bit = A%2;
                if(bit == 1){
                    numberOfSetBits += 1;
                }
                A = A/2;
            }

            return numberOfSetBits;
    } 
    
}
