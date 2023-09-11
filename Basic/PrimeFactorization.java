package Basic;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f = 2;
        while (f * f <= n) {
            while(n%f==0){
                System.out.print(f + " ");
                n = n/f;
            }
        }
        if(n>1)
        System.out.print(n);
    }

}
