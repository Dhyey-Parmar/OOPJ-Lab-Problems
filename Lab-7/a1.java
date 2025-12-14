// A 1 Write a program to create circle class with area function to find area of circle. [A]

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
public class a1 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area of the circle: " + c.area());
    }
}
