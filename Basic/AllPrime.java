package Basic;

import java.util.Scanner;

/**
 * Checking Prime number for t test cases
 */
public class AllPrime {

     public static void main(String [] args){
          Scanner scn = new Scanner(System.in);                

          int t = scn.nextInt(); // t for no. of testcases

          for(int i=1;i<=t;i++){
               int count = 0;
               int n = scn.nextInt();

               if(n==1){
                    System.out.println("Not Prime");
               }
               else{
                    for(int div=2;div*div<=n;div++){
                         if(n%div==0){
                              count++;
                              break;
                         }                    
                    }
                    if(count==0)
                    System.out.println("Prime");
                    else{
                         System.out.println("Not Prime");
                    }
               }
               

          }   
          
        
     }
}