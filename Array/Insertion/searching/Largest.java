package searching;

import java.util.*;

public class Largest {

    public static int largestElement(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(largest<arr[i])
                largest = arr[i];
        }
        return largest;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the data into list : ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int largest = largestElement(arr);
        System.out.println("Largest element : "+largest);
        
    }
}
