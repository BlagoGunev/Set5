package week23.polynomials;

public class PolynomialTest {

    public static void main(String[] args) {
        Polynomial polynomial1 = new Polynomial();
        polynomial1.create(3, new double[]{1, 0, 3, 1});

        System.out.println(polynomial1.toString());

        Polynomial polynomial2 = new Polynomial();
        polynomial2.create(2, new double[]{2, 2, 1});

        Polynomial polynomial3 = Polynomial.addPolynomials(polynomial1, polynomial2);
        System.out.println(polynomial3);

        polynomial3 = Polynomial.multPolynomialMonomial(polynomial1, new Monomial(2, 1));
        System.out.println(polynomial3);

        polynomial3 = Polynomial.multPolynomials(polynomial1, polynomial2);
        System.out.println(polynomial3);
    }

}
