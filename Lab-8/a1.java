// A 1 Define Time  class with constructor to initialize  hour and minute. Also define  addition 
// method to add two time objects. [A]
class Time {
    int hour;
    int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time add(Time other) {
        int totalMinutes = this.minute + other.minute;
        int totalHours = this.hour + other.hour + totalMinutes / 60;
        totalMinutes = totalMinutes % 60;
        return new Time(totalHours, totalMinutes);
    }

}

public class a1 {
    public static void main(String[] args) {
        Time t1 = new Time(11, 45);
        Time t2 = new Time(1, 30);
        Time t3 = t1.add(t2);
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);
        System.out.println("Added Time: " + t3);
    }
}
