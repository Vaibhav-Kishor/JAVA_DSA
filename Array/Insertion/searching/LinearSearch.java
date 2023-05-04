package searching;
import java.util.Scanner;
public class LinearSearch {

    // method to search given key
    public static int linearSearch(int arr[],int key,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        // creating array
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt(); //size of array

        int arr[] = new int[n];

        // taking data from the user
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // taking key
        System.out.println("Enter the Key to find in list: ");
        int key = sc.nextInt();

        // receiving key index
        int index = linearSearch(arr, key, n);
        // display output
        if(index==-1)   
            System.out.println("Key is not present in array");
        else
            System.out.println("Key is at index : "+index);


       
    }
}
