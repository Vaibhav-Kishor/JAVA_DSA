package BinarySearch;

import java.util.Scanner;

public class FirstLastOccurance {

    public static int findFirstOccurance(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int latest_index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                latest_index = mid;
                end = mid - 1;
            } else if (key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;

        }
        return latest_index;
    }

    public static int findLastOccurance(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int latest_index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                latest_index = mid;
                start = mid + 1;
            } else if (key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;

        }
        return latest_index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking size of array
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        // Taking number
        System.out.println("Enter the " + size + " no. : ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Taking key
        int key = sc.nextInt();
        System.out.println("Enter the key : ");

        int firstIndex = findFirstOccurance(arr, key);
        int lastIndex = -1;
        if (firstIndex > -1)
            lastIndex = findLastOccurance(arr, key);

        if (firstIndex == -1) {
            System.out.println("Element is not available");
        } else {
            System.out.println("First Occurance of " + key + " at " + firstIndex);
            System.out.println("Last Occurance of " + key + " at " + lastIndex);
        }

    }
}
