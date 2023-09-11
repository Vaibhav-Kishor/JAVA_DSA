package BinarySearch;
import java.util.Scanner;
// when you don't no about sorted array is 
public class AgnosticSearch {

    public static int ascendingBinarySearch(int arr[], int key) {
        int end = arr.length - 1;
        int start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;

    }

    public static int decendingBinarySearch(int arr[], int key) {
        int end = arr.length - 1;
        int start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                end = mid - 1;
            else
                start = mid + 1;
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

        if (n == 1) {
            if (key == arr[0])
                System.out.println(key + " present at 0");
            else
                System.out.println("element is not available");
        } else {
            int atPos;
            if (arr[0] < arr[1]) {
                atPos = ascendingBinarySearch(arr, key);
            } else {
                atPos = decendingBinarySearch(arr, key);
            }
            if (atPos == -1)
                System.out.println(key + " is not available");
            else
                System.out.println(key + " is available at " + atPos);

        }
    }

}
