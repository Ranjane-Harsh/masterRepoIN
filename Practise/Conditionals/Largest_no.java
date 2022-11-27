package Practise.Conditionals;
import java.util.Scanner;
public class Largest_no{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. A");
    int a = sc.nextInt();
    System.out.println("Enter no. B");
    int b = sc.nextInt();
    System.out.println("Enter no. C");
    int c = sc.nextInt();
    sc.close();
    if(a>b&&a>c){
        System.out.println("A is Greatest number entered");
    }
    else if(b>a&&b>c){
 System.out.println("B is the greatest number entered");
    }
    else if(c>a&&c>b){
        System.out.println("C is the greatest number entered");
    }
}
}