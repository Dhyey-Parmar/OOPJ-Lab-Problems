// A 4 Write  a  program  to  get  2  numbers  from  the  user  and  print  the  sum  of  two  numbers 
// using command line and Scanner class.[A]
import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Through Command Line 
        if (args.length >= 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("Sum (Command Line): " + (num1 + num2));
        } else {
            System.out.println("Please provide two numbers as command line arguments.");
        }
        // Scanner class
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
    
        System.out.println("Sum (Scanner): " + (n1 + n2));
        sc.close();
    }
}