package Basic;

import java.util.Scanner;

public class Prime {
    public static void main (String[]args)
  {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give a number :");
        int n = scn.nextInt();
        
        int div = 2;
        boolean isPrime = true;
        
        while(div*div<=n){
            int rem = n%div;
            if(rem==0){
                isPrime=false;
                break;
            }
            div++;
        }
    if(isPrime==true)
        System.out.println(+n+" is a prime number");
    else
        System.out.println(n+" is not a prime number");
  }
}
