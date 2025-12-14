// C 5 Write  a  Java  program  to  create  a  class  called  House  with  private  instance  variables 
// address, numberOfRooms, and area. Provide public getter and setter methods to access 
// and modify these variables. Add a method called calculatePrice() that returns the price 
// of the house based on its area and a price per square meter.[C]
class House {
    private String address;
    private int numberOfRooms;
    private double area;
    private static final double PRICE_PER_SQUARE_METER = 1000.0;

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice() {
        return area * PRICE_PER_SQUARE_METER;
    }
}
public class c5 {
    public static void main(String[] args) {
        House house = new House("Madhapar 7", 4, 1235.2);
        System.out.println("Address: " + house.getAddress());
        System.out.println("Number of Rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea());
        System.out.println("Price: " + house.calculatePrice());
    }
}
