class SingleNumber {

    public static void main(String[] args){
        
        int[] arr = {1,1,2,2,3,3,4,4,5};
        int output = singleInteger(arr);
        System.out.println(output);
    }

    public static int singleInteger(int[] input){
        int answer = 0;
        for (int i : input){
            answer ^= i;
        }
        
        return answer;
    }
}