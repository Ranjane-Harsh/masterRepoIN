package Practise.arrays;

public class maxValue {
    public static void main(String[] args) {
        int[] arr={224,122,456,668,789,465,122};
        System.out.println(maxval(arr));
        System.out.println(maxrange(arr, 0, 3));

    }
     public static int maxval(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

     }

     public static int maxrange(int[] arr, int ind1, int ind2){
        int maxm = arr[ind1];
        for (int i = ind1; i <= ind2; i++) {
            if(arr[i]>maxm){
                maxm=arr[i];
            }
            
        }
        return maxm;

     }
    
}
