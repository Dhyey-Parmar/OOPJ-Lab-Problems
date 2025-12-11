// A 3 Write a java program to take user input [A] 
//i. Through Command Line Argument.
// ii. Through Scanner class.

import java.util.Scanner;

public class a3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // i. Through Command Line Argument
      System.out.println("Command Line Argument: " + args[0]);
    // ii. Through Scanner class
    System.out.print("Enter a value through Scanner: ");
    String input = sc.nextLine();
    System.out.println("Scanner Input: " + input);
  }  
}