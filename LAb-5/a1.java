// A 1 Write a Java program to sum values of an array.[A]

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Sum of array elements: " + sum);
        sc.close();
    }
}
