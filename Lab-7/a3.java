// B 3 Create  a  class  which  ask  the  user  to  enter  a  sentence,  and  it  should  display  count  of 
// each vowel type in the sentence. The program should continue till user enters a word 
// “quit”. Display the total count of each vowel for all sentences. [B]
import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        String input;
        do {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            input = sc.nextLine();
            if (!input.equals("quit")) {
                for (int i = 0; i < input.length(); i++) {
                    char ch = Character.toLowerCase(input.charAt(i));
                    switch (ch) {
                        case 'a': countA++; break;
                        case 'e': countE++; break;
                        case 'i': countI++; break;
                        case 'o': countO++; break;
                        case 'u': countU++; break;
                    }
                }
            }
        } while (!input.equalsIgnoreCase("quit"));
        System.out.println("Total counts of vowels:");
        System.out.println("A: " + countA);
        System.out.println("E: " + countE);
        System.out.println("I: " + countI);
        System.out.println("O: " + countO);
        System.out.println("U: " + countU);
        sc.close();
    }
}
