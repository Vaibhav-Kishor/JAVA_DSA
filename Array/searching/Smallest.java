package searching;
import java.util.*;
public class Smallest {
    public static int smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest)
                smallest = arr[i];
        }
        return smallest;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the data into the list : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int smallest = smallest(arr);
        System.out.println("Smallest element : "+smallest);
        
    }
}
