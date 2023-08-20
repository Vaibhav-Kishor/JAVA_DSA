package Array;
import java.util.Scanner;
public class SubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Taking the size of array
        int n = scn.nextInt();
        
        int arr [] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        // printing sub array
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
            System.out.print(" ");
            }
        System.out.println();
        }
    }
}
