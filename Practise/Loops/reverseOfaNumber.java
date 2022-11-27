package Practise.Loops;

public class reverseOfaNumber {
    public static void main(String[] args) {
        int n = 1234;
        //second approach int ans =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
          //second approach ans = ans*10+rem;
           System.out.print(rem);
        }
        
    }
    
}
