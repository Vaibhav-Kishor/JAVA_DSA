package Array;

import java.util.Scanner;

public class Diff {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        // first array
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<arr1.length;i++)
            arr1[i] = scn.nextInt();

        // second array
        int n2 = scn.nextInt();
        int arr2 [] = new int[n2];
        for(int j=0;j<arr2.length;j++)
            arr2[j] = scn.nextInt();

        // 3rd array hold the difference of first and second arrray
        int diff [] = new int[n1>n2 ? n1:n2];

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;

        int c = 0; // holds carry

        while(k>=0){
           int d = 0;

           if(i>=0)
                d = arr1[i];
           if(j>=0)
                d = 

        }




    }
}
