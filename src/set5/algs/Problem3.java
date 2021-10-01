package set5.algs;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ulx, uly, drx, dry;

        System.out.println("First rectangle upper left x:");
        ulx = scanner.nextInt();
        System.out.println("First rectangle upper left y:");
        uly = scanner.nextInt();
        System.out.println("First rectangle down right x:");
        drx = scanner.nextInt();
        System.out.println("First rectangle down right y:");
        dry = scanner.nextInt();
        Rectangle rect1 = new Rectangle(ulx, uly, drx, dry);

        System.out.println("Second rectangle upper left x:");
        ulx = scanner.nextInt();
        System.out.println("Second rectangle upper left y:");
        uly = scanner.nextInt();
        System.out.println("Second rectangle down right x:");
        drx = scanner.nextInt();
        System.out.println("Second rectangle down right y:");
        dry = scanner.nextInt();
        Rectangle rect2 = new Rectangle(ulx, uly, drx, dry);

        if (rect1.containsRect(rect2)) {
            System.out.println("Second rectangle is contained in first rectangle");
        } else if (rect2.containsRect(rect1)) {
            System.out.println("First rectangle is contained in second rectangle");
        } else {
            System.out.println("Neither of the rectangles is contained in the other");
        }

    }

}
