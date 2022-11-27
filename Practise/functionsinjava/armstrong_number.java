package Practise.functionsinjava;

public class armstrong_number {
    public static void main(String[] args) {
       //
    for (int i = 100; i < 1000; i++) {
        if(arm(i)){
            System.out.print(i+" ");
        }
    }
    }
    static boolean arm(int a){
        int original = a;
        int sum=0;
        while(a>0){
        int rem = a%10;
        sum=sum+rem*rem*rem;
        a=a/10;
        }

        return sum==original;
       
       
        

    }
}
