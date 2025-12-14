// A 2 Write a Java program to find the angle between the hour and minute hands.[A]
import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-12): ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();

        double hourAngle = (hours * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minuteAngle);

        angle = Math.min(angle, 360 - angle);

        System.out.println("The angle between the hour and minute hands is: " + angle + " degrees");

        sc.close();
    }
}