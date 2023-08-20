package Basic;

import java.util.Scanner;

public class GcdAndLcm {
        public static void main(String [] args){
            Scanner scn = new Scanner(System.in);
            // Taking two number from user n1,n2 
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();

            int tn1 = n1;
            int tn2 = n2;
           
            while(n1%n2!=0){
                int rem = n1%n2;              
                n1 = n2;
                n2 = rem;                
            }

            int gcd = n2;
            int lcm = (tn1*tn2)/gcd;

            System.out.println(gcd);
            System.out.println(lcm);
            
        }
}
