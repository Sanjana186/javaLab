/* Design a class called Complex with two data members, real and imaginary. Perform the following
operations. Use default and parameterised constructors to initialise the values of data members. Use
display() to display a Complex number in proper format. Use multiply()  to multiply two Complex
Numbers and return the resultant Complex Number. Use MainClass to create complex objects and
perform computation. */
public class Complex {
    double real;
    double imaginary;
    Complex()
    {
        real = 0.0;
        imaginary = 0.0;
    }
    Complex(double r, double i)
    {
        this.real = r;
        this.imaginary = i;
    }
    void display()
    {
        if(imaginary > 0)
        {
            System.out.println(real + " +i"+imaginary);
        }
        else
        {
            System.out.println(real+ " "+imaginary+"i");
        }
    }
    Complex multiply(Complex c1)
    {
        double r = (c1.real * this.real) - (c1.imaginary * this.imaginary);
        double i = (c1.real * this.imaginary) + (c1.imaginary * this.real);
        return new Complex(r,i);
    }
}
