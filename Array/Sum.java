package Array;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    // Taking number for array1
    int n1 = scn.nextInt();
    int [] arr1 = new int[n1];
    for(int i=0;i<arr1.length;i++){
        arr1[i] = scn.nextInt();
    }

    // Taking number for array2
    int n2 = scn.nextInt();    
    int [] arr2 = new int[n2];
    for(int j=0;j<arr2.length;j++){
        arr2[j] = scn.nextInt();
    }

    int [] sum = new int[n1>n2 ? n1:n2];

    // variable which pointing array index
    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = sum.length-1;

    // logic for sum
    int c = 0; // hold carry
    while(k>=0){
        int d = c;

        if(i>=0){
            d = d+arr1[i];
        }
        if(j>=0){
            d = d+arr2[j];
        }

        c = d/10;
        d = d%10;

        sum[k] = d;

        i--;
        j--;
        k--;
    }  
        int idx = 0;
        if(c==0){
        while(idx<sum.length){
            if(sum[idx]!=0)
                break;
            else
                idx++;
        }
        
        while(idx<sum.length){
            System.out.print(sum[idx]);
            idx++;
        }
      }
    else{
        System.out.print(c);
        while(idx<sum.length){
            System.out.print(sum[k]);
            idx++;
        }
    }
            
        




    }    
   
}
