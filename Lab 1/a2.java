
// A 2 WAP to find a sum of numbers entered by user. (E.g: 582=5+8+2=15) [A] 
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt(), sum=0;
        System.out.println("Sum of digits is:");
        while (x != 0) {
            sum=sum+(x%10);
            x=x/10;
        }
         System.out.println(sum);
    }
}