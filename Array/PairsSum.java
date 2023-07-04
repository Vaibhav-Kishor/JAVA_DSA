package Array;
import java.util.Scanner;

public class PairsSum {
    public static void printPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                System.out.print(" ->> sum: "+(arr[i]+arr[j])+", ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the data into the list : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        printPairs(arr);
    }
}
