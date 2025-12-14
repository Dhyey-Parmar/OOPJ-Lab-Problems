// C 6 Write a program to find length of string and print second half of the string.[C] 



public class c6 {
    public static void main(String[] args) {
        String str = "Dhyey Parmar";
        int length = str.length();
        System.out.println("Second half of string: " + str.substring(length/2));
    }
}

