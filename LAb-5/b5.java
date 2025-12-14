// B 5 Write an interactive program to print a string entered in a pyramid form. For instance, 
// the string "stream" has to be displayed as follows:[B]  
// s 
// st 
// str 
// stre 
// strea 
// stream
import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}