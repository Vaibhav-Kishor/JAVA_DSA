package Basic.digitConcept;

import java.util.Scanner;

// Rotate Digit of a number by k times
public class RotateDigitByKtimes {
    public static void rotate(int n, int k,int count) {
        // Making Divisor & Multiplier
        int div =1;
        int mul =1;
        for(int i=1;i<=count;i++){
            if(div<=k)
                div = div*10;
            else
                mul = mul*10;
        }
        // find rotate
        
        int rotateNo = ((n%k)*mul) +n/div;
        System.out.println(rotateNo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Step 1 : Counting digit
        int tn = n; // hold copy of n
        int count = 0; // holds no. of digit
        while (tn > 0) {
            count++;
            tn = tn / 10;
        }
        // Step : Taking how many times user want to rotate
        int k = sc.nextInt();
        // Special Case 1: Cheking k is greater than n or not?
        if (k > count) {
            k = k % count;
        }
        // Special Case 2: Cheking k is negative or not?
        if (k < 0) {
            k = k + count;
        }

        rotate(n, k, count);

    }
}
