package Basic.digitConcept;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        //Taking number and key
        int n = scn.nextInt();
        int key = scn.nextInt();

        int frequency =  digitFrequency(n,key);
        System.out.println("Frequency of "+key+" is "+frequency);
    }

    public static int digitFrequency(int n,int key){
        int frequency=0;

        while(n!=0){
        int lastDigit = n%10;

        if(lastDigit==key)
            frequency++;
        
        n = n/10;
        }
        return frequency;
    }
}
