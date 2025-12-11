// C 7 Write a program to print prime numbers between given range. [C]

import java.util.Scanner;

public class c7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the least and highest element of range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        String primes="";
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
               primes+=i+" "; 
            }
        }
        System.out.println(primes);
        sc.close();
    }

    
}
