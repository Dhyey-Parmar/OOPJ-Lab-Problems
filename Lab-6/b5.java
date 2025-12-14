// Write a Java program to create a class called Employee with a name, job title, and salary 
// attributes, and methods to calculate and update salary.



class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
}

public class b5 {

    public static void main(String[] args) {
        Employee emp = new Employee("emp1", "Software Engineer", 150000);
        System.out.println("Employee Information:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: " + emp.getSalary());
        emp.updateSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}