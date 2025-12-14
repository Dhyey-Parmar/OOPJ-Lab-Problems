// A 1 
// Create  class  Student  with  attributes  (name:  String,  roll_no:int,  SPI:double, 
// course:  String).  Implement  getter()  and  setter()  method  to  assign  data  for  3 
// students and display it.[A]

class student{
    String name;
    int roll_no;
    double SPI;
    String course;

    public void setter(String name, int roll_no, double SPI, String course){
        this.name = name;
        this.roll_no = roll_no;
        this.SPI = SPI;
        this.course = course;
    }
    public void getter(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("SPI: " + SPI);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class a1 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.setter("stu1", 360, 8.84, "cse");
        s2.setter("stu2", 209, 8.88, "cse");
        s3.setter("stu3", 420, 9.38, "cse");

        s1.getter();
        s2.getter();
        s3.getter();
    }
}
