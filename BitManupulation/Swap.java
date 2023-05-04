import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        num1= num1^num2;
        num2= num1^num2;
        num1= num1^num2;

        System.out.println("Num1 : "+num1  +", Num2: "+num2);
    }
}

