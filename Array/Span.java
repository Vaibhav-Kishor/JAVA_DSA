package Array;

import java.util.Scanner;

public class Span {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Taking Size of array 
        int n = scn.nextInt();

        // Creating array
        int [] arr = new int[n];

        // Taking number;
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        // logic for span
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];            
            if(arr[i]>max)
                max = arr[i];            
        }

        int span = max-min;
        System.out.println("Span of Array : "+span);
        
    }
}
