// C 5 Write  a  program  that  prompts  the  user  to  enter  three  numbers.  Find  the  largest 
// number.[C]

import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        if(num1>num2){
            if(num1>num3){
                System.out.println("Largest number is: " + num1);
            }else{
                System.out.println("Largest number is: " + num3);
            }
        }else{
            if(num2>num3){
                System.out.println("Largest number is: " + num2);
            }else{
                System.out.println("Largest number is: " + num3);
            }
        }
        sc.close();
    }
}
