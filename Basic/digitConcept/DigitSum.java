package Basic.digitConcept;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = sc.nextInt();

        while(n>0){
            int digit = n%10;
            sum = sum+digit;
            n = n/10;
        }
        System.out.println(sum);
        
    }
}
