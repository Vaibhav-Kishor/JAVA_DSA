package Array.searching;
import java.util.Scanner;
public class BinarySearch {

    public static int binarySearch(int arr[],int n,int key){
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid]<key)    
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the data : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key : ");
        int key = sc.nextInt();

        int index = binarySearch(arr,n,key);
        if(index==-1)
            System.out.println("Key is not present in the list");
        else
            System.out.println("Key at index : "+index);
    }
}
