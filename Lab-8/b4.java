// B 4 Write a Java program to create a class called Area with a static final variable PI=3.14159. 
// Implement a method to calculate the area of a circle given its radius.[B
class Area {
    static final double PI = 3.14159;

    public double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}

public class b4 {
    public static void main(String[] args) {
        double radius = 5.0;
        Area area = new Area();
        System.out.println("Area of circle with radius " + radius + " is: " + area.calculateCircleArea(radius));
    }
}
