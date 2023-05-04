package Basic.digitConcept;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dubNum = num;

        int digitCount = 0;
        int armstrongNum = 0;

        while(num>0){
            digitCount++;
            num = num/10;
        }
        num = dubNum;
        

        while(dubNum>0){
            int lastDigit = 0;
            lastDigit = dubNum%10;
            armstrongNum += Math.pow(lastDigit,digitCount);          
            dubNum = dubNum/10;
        }
        
    if(num==armstrongNum){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    }
}
