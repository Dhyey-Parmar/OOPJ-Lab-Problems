// A 2 Write a program to create basic calculator by getting 2 numbers and an operation(+,-
// ,/,*,%) from the user and apply the operation given in a string on the given numbers.[A]

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /, %): ");
        String operation = sc.next();
        switch (operation) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case "%":
                System.out.println("Result: " + (num1 % num2));
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
        sc.close();
    }
    
}
