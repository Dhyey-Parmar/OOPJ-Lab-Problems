// B 4 Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-
// 32*5/9 ) [B]

import java.util.Scanner;

public class b4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = sc.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println("Temperature in Celsius: " + celsius);
    sc.close();
   } 
}
