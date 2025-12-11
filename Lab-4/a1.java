// A 1 The marks obtained by a student in 5 different subjects are input through the 
// keyboard.  
// The student gets a division as per the following rules: 
// I. Percentage above or equals to 60-first division 
// II. Percentage between 50 to 59-second division 
// III. Percentage between 40 and 49-Third division 
// IV. Percentage less than 40-fail 
// Write a program to calculate the division obtained by the student.[A]

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double percentage = (total / 500.0) * 100;
        if (percentage >= 60) {
            System.out.println("Division: First Division");
        } else if (percentage >= 50) {
            System.out.println("Division: Second Division");
        } else if (percentage >= 40) {
            System.out.println("Division: Third Division");
        } else {
            System.out.println("Division: Fail");
        }

        sc.close();
    }
}