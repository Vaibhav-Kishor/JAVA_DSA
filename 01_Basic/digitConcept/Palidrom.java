package Basic.digitConcept;

import java.util.Scanner;

public class Palidrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int dupNum = num;

        int reverseNum = 0;

        while(num>0){
            int lastDigit = 0;
            lastDigit = num%10;
            reverseNum = (reverseNum*10)+lastDigit;
            num = num/10;
        }
        if(dupNum==reverseNum){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
