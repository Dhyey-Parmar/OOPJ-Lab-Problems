// B 4 Implement an array  with 5  elements in class A.  Create four methods for array 
// operation(sortArray(),  searchArray(),  SumArray(),  and  avgArray())  and  call  all  the  four 
// methods using object.[B]

import java.util.Scanner;

class ArrayOperations {
    int[] arr = new int[5];

    public void sortArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int searchArray(int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int sumArray() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public double avgArray() {
        return (double) sumArray() / arr.length;
    }

    public void setArray(int[] inputArr) {
        if (inputArr.length == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = inputArr[i];
            }
        } else {
            System.out.println("Input array must have exactly " + arr.length + " elements.");
        }
    }
}

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations arr = new ArrayOperations();
        int[] inputArr = new int[5];
        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < 5; i++) {
            inputArr[i] = sc.nextInt();
        }
        arr.setArray(inputArr);
        arr.sortArray();
        System.out.println("Sorted Array:");
        for (int i=0; i<5; i++) {
            System.out.print(arr.arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter an element to search: ");
        int target = sc.nextInt();
        int index = arr.searchArray(target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}
