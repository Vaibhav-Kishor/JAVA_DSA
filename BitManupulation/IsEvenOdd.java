import java.util.Scanner;

public class IsEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num&1==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}