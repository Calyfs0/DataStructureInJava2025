import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfInputs = sc.nextInt();

        for(int i=0;i<noOfInputs;i++){
            sc.nextLine();
            int arrayLength = sc.nextInt();
            int odd = 0;
            int even = 0;
            int absValue = 0;
            for(int j=0;j<arrayLength;j++){
                int val = sc.nextInt();

                if(val % 2 == 0)
                    even++;
                else
                    odd++;

            }
            absValue = Math.abs(even - odd);
            System.out.println(absValue);
        }
        sc.close();
    }
}
