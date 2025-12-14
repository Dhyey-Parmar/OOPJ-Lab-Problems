// A 2 Write a program that creates and initializes a four integer element array. Calculate and 
// display the average of its values.[A]
public class a2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / (double) arr.length;
        System.out.println("Average of array elements: " + avg);
    }
}
