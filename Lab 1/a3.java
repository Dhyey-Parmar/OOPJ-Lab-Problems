// 3 WAP to find a sum of even number 1D array. [A]
import java.util.Scanner;
public class a3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5],sum=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value in array for index-"+i);
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if((array[i]%2)==0)
            sum=sum+array[i];
        }
        System.out.println("Sum of even numbers of array is "+sum);
        sc.close();
    }
}