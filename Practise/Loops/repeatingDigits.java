package Practise.Loops;
import java.util.Scanner;
public class repeatingDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. to be checked");
        int n = in.nextInt();
        System.out.println("Enter the repeating Digit");
        int i = in.nextInt();
        in.close();
        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem==i){
                count++;
            }
            n = n/10;
        }
        System.out.println("The digit "+i+" is repeated "+count+" times");

    }
}
