// B 4 Write  a Java program to copy  all the elements of an array  to another array and print 
// both the array elements. [B]

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of first array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nElements of second array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
