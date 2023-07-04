package Array;
import java.util.Scanner;
public class Reverse {
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the data into the list : ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        reverseArray(arr);
        System.out.print("Reverse of list : [");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] +" ");
        System.out.print("]");
    }
}
