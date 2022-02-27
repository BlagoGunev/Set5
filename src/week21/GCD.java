package week21;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt(); y = scanner.nextInt();

        System.out.println("GCD(x, y) = " + foo(x, y));

    }


    // Пресмята най-големия общ делител на x и y по метода на Евклид
    public static int foo (int x, int y)
    {
        if (y == 0)
            return x;
        else
            return foo(y, x % y);
    }

}
