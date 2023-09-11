package BinarySearch;

import java.util.Scanner;

// Given array is sorted in ascending order
public class BinarySearch01 {

    public static int search(int arr[], int key) {
        int end = arr.length - 1;
        int start = 0;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Taking input
        System.out.println("Enter number : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking key
        System.out.println("Enter the key : ");
        int key = sc.nextInt();

        int atPos = search(arr, key);
        if (atPos == -1)
            System.out.println("Element is not available");
        else
            System.out.println(+key + " Present at Index " + atPos);
    }
}
