package set12.locator;

public class Location {

    public int row = 0, column = 0;
    public double maxValue = -1;

    public static Location locateLargest(double[][] a, int rows, int columns) {
        Location maxLocation = new Location();

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                if (maxLocation.maxValue < a[y][x]) {
                    maxLocation.maxValue = a[y][x];
                    maxLocation.row = y;
                    maxLocation.column = x;
                }
            }
        }

        return maxLocation;
    }

}
