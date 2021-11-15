package set12.locator;
import java.util.Scanner;

public class LocationTests {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        rows = scanner.nextInt();
        columns = scanner.nextInt();
        scanner.nextLine();

        double[][] a = new double[rows][columns];

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                a[y][x] = scanner.nextDouble();
            }
            scanner.nextLine();
        }

        Location maxLocation = Location.locateLargest(a, rows, columns);

        System.out.printf("The location of the largest element is %f at (%d, %d)",
                maxLocation.maxValue, maxLocation.row, maxLocation.column);

    }

}
