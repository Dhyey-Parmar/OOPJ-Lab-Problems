// A 3 Write a program to calculate the area of Rectangle.[A]

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Area of the Rectangle: " + (length * width));
        sc.close();
    }
}
