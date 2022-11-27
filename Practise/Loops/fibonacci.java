package Practise.Loops;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       in.close();
       int i=2;
       int a=0;
       int b=1;
       while(i<=n){
        int temp =b;
        b=b+a;
        a=temp;
        i++;
       }
       System.out.println(b);
    }
}
