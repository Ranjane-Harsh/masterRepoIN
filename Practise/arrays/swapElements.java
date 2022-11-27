package Practise.arrays;

import java.util.Arrays;

public class swapElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));

    }
     
    public static void swap(int[] arr,int inda,int indb){
        int temp = arr[inda];
        arr[inda] = arr[indb];
        arr[indb] = temp;

    }
    
}
