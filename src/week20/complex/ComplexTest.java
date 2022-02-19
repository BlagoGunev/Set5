package week20.complex;

import java.util.Scanner;

public class ComplexTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first complex: ");
        Complex a = new Complex(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Input second complex: ");
        Complex b = new Complex(scanner.nextDouble(), scanner.nextDouble());

        scanner.close();

        Complex c = a.clone();

        a.add(b);
        System.out.println(" + :" + a);
        a.setTo(c);

        a.subtract(b);
        System.out.println(" - :" + a);
        a.setTo(c);

        a.multiply(b);
        System.out.println(" * :" + a);
        a.setTo(c);

        a.divide(b);
        System.out.println(" / :" + a);
        a.setTo(c);

        System.out.println(a.abs() + " " + b.abs());
    }

}
