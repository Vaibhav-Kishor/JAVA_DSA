package Array;

import java.util.Scanner;

public class Find {
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    // Taking size of array
    int n = scn.nextInt();

    // Creating array 
    int arr [] = new int[n];

    // Taking number
    for(int i=0;i<arr.length;i++){
        arr[i] = scn.nextInt();
    }

    // Taking key
    int k = scn.nextInt();
    int foundAt = -1;

    // logic
    for(int i=0; i<arr.length;i++){
        if(arr[i]==k){
            foundAt = i;
            break;
        }
    }
    System.out.println("FoundAt "+foundAt);

}   
}
