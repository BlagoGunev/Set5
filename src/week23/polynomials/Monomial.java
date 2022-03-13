package week23.polynomials;

public class Monomial {

    public double coefficient;
    public int power;

    public Monomial() {
        this.coefficient = 0;
        this.power = 0;
    }

    public Monomial(double coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
    }
}
