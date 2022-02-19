package week20.complex;

public class Complex implements Comparable<Complex>, Cloneable{

    private double a, b;

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void add(Complex c) {
        this.a += c.a;
        this.b += c.b;
    }

    public void subtract(Complex c) {
        this.a -= c.a;
        this.b -= c.b;
    }

    public void multiply(Complex c) {
        this.a = this.a * c.a - this.b * c.b;
        this.b = this.b * c.a + this.a * c.b;
    }

    public void divide(Complex c) {
        this.a = (this.a * c.a + this.b * c.b) / (c.a * c.a + c.b * c.b);
        this.b = (this.b * c.a - this.a * c.b) / (c.a * c.a + c.b * c.b);
    }

    public double abs() {
        return Math.sqrt(this.a * this.a + this.b * this.b);
    }

    public double getRealPart() {
        return this.a;
    }

    public double getImaginaryPart() {
        return this.b;
    }

    public void setTo(Complex c) {
        this.a = c.a;
        this.b = c.b;
    }

    @Override
    public int compareTo(Complex o) {
        return Double.compare(this.abs(), o.abs());
    }

    @Override
    public Complex clone() {
        try {
            Complex clone = (Complex) super.clone();
            clone.a = this.a;
            clone.b = this.b;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        if (-0.0001 < b && b < 0.0001) {
            return String.format("%f", this.a);
        } else {
            return String.format("(%f + %fi)", this.a, this.b);
        }
    }
}
