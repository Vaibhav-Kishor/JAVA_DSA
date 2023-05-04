import java.util.Scanner;

public class AtFirst{
    
    // creating a method for inserting data at first position
    public static int[] insertAtFirst(int size,int new_arr[],int data){
        for(int index=size-2;index>0;index--){
            new_arr[index] = new_arr[index-1];            
        }
        new_arr[0] = data;
        return new_arr;
    }


    public static void main(String args[]){
        // taking size of array
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};

        // creating new array and copy data from old array to new array
        int new_arr[] = new int[arr.length+1];
        int size = new_arr.length;
        new_arr = arr.clone();

        // Taking data to insert at first position of newly create array
        System.out.println("Enter the data : ");
        int data = sc.nextInt();

       new_arr =  insertAtFirst(size, new_arr, data);

       // Displaying Output of new array after inserting data at first position
       System.out.print("Output : [");
       for(int i=0;i<size;i++){
        System.out.print(new_arr[i]);
       }
       System.out.println("]");
    }
}