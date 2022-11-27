package Practise.Conditionals;
import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char S = in.next().trim().charAt(0);
        in.close();

        if(S>='a'&&S<'z'){
            System.out.println("Starts with lowercase");
        }
        else{
            System.out.println("Starts with uppercase");
        }


    }
    
}
