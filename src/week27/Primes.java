package week27;

import java.util.*;
import java.util.stream.Collectors;

public class Primes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> factors = new ArrayList<>();

        for (int p = 2; p <= Math.sqrt(n); p++) {
            if (n % p == 0) {
                factors.add(p);
                while (n % p == 0) {
                    n /= p;
                }
            }
        }

        if (factors.size() == 0) {
            System.out.println("The number is prime.");
        } else {
            System.out.println(factors.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }

    }

}
