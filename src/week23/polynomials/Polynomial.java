package week23.polynomials;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial implements Comparable<Polynomial>, Cloneable {

    private final LinkedList<Monomial> coefficients;
    private int size;

    public Polynomial() {
        coefficients = new LinkedList<>();
    }

    public void create(int n, double[] coefficients) {
        this.size = n;
        this.coefficients.clear();
        for (int i = 0; i <= n; i++) {
            if (coefficients[i] == 0) {
                continue;
            }
            this.coefficients.add(new Monomial(coefficients[i], n - i));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("P(x) = ");

        Iterator<Monomial> iterator = this.coefficients.iterator();
        while (iterator.hasNext()) {
            Monomial monomial = iterator.next();
            stringBuilder.append(monomial.coefficient);
            if (monomial.power > 0) {
                stringBuilder.append(" * x^").append(monomial.power);
            }
            if (iterator.hasNext()) {
                stringBuilder.append(" + ");
            }
        }

        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Polynomial o) {
        return Integer.compare(this.size, o.size);
    }

    public static Polynomial addPolynomials (Polynomial x, Polynomial y) {
        Polynomial polynomial = new Polynomial();
        Polynomial a, b;
        if (x.compareTo(y) < 0) {
            a = y; b = x;
        } else {
            a = x; b = y;
        }

        int size = a.getSize();
        double[] coef = new double[size + 1];

        Iterator<Monomial> iterator = a.getCoefficients().iterator();
        while (iterator.hasNext()) {
            Monomial monomial = iterator.next();
            coef[size - monomial.power] += monomial.coefficient;
        }

        iterator = b.getCoefficients().iterator();
        while (iterator.hasNext()) {
            Monomial monomial = iterator.next();
            coef[size - monomial.power] += monomial.coefficient;
        }

        polynomial.create(size, coef);
        return polynomial;
    }

    public static Polynomial multPolynomialMonomial(Polynomial a, Monomial m) {
        Polynomial polynomial = a.clone();
        for (Monomial monomial : polynomial.getCoefficients()) {
            monomial.coefficient *= m.coefficient;
            monomial.power += m.power;
        }

        return polynomial;
    }

    public static Polynomial multPolynomials(Polynomial x, Polynomial y) {
        Polynomial polynomial = new Polynomial();
        Polynomial a, b;
        if (x.compareTo(y) < 0) {
            a = y; b = x;
        } else {
            a = x; b = y;
        }

        int size = a.getSize() + b.getSize();
        double[] coef = new double[size+1];

        for (Monomial ma : a.getCoefficients()) {
            for (Monomial mb : b.getCoefficients()) {
                coef[size - (ma.power + mb.power)] = ma.coefficient * mb.coefficient;
            }
        }

        polynomial.create(size, coef);
        return polynomial;
    }

    public LinkedList<Monomial> getCoefficients() {
        return coefficients;
    }

    public int getSize() {
        return size;
    }

    public Polynomial clone() {
        Polynomial polynomial = new Polynomial();
        polynomial.create(this.size, this.coefficients);
        return polynomial;
    }

    private void create(int n, LinkedList<Monomial> coefficients) {
        this.size = n;
        this.coefficients.clear();
        for (Monomial m : coefficients) {
            this.coefficients.add(new Monomial(m.coefficient, m.power));
        }
    }
}
