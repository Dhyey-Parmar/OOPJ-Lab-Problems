// C 6 Write a program that prompts the user to enter a letter and check whether a letter is a vowel or a constant.[C]

import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel.");
        } else if (letter >= 'b' && letter <= 'z') {
            System.out.println(letter + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter a valid letter.");
        }

        sc.close();
    }
}
