package Basic;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dubNum = num;

        int armstrongNum = 0;

        while(dubNum>0){
            int lastDigit = 0;
            lastDigit = dubNum%10;
            armstrongNum = armstrongNum+(lastDigit*lastDigit*lastDigit);
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
