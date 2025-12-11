// A 4 Write a program to check that the given number is prime or not.[A]

import java.util.Scanner;

public class a4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    boolean isPrime = true;
    if (number <= 1) {
        isPrime = false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            System.out.println(number + " is a not a prime number.");
            break;
        }
    }
    if (isPrime) {
        System.out.println(number + " is a prime number.");
    }
    sc.close();
}
}