// C 4 Define class for Complex number with real and imaginary as data members. Create its 
// constructor,  overload  the  constructors.  Also  define  addition  method  to  add  two 
// complex objects. [C]

class Complex {
    double real;
    double imaginary;

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

}

public class c4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.5, 3.5);
        Complex c2 = new Complex(1.5, 2.5);
        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
    }
}
