package Basic.digitConcept;

import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp_n = n;
        int div = 1;

        while (temp_n >= 10) {
            temp_n = temp_n / 10;
            div = div * 10;
        }
        temp_n = n;
        while(div!=0){
            int qun = temp_n/div;
            System.out.println(qun);
            temp_n = temp_n%div;
            div = div/10;
        }

    }

}
