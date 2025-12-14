// A 2 WAP that counts the number of objects created using static. [A] 
class Counter {
    static int objectCount = 0;

    public Counter() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

public class a2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Number of objects created: " + Counter.getObjectCount());
    }
}
