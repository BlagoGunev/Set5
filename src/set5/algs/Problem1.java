package set5.algs;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        final int bigBucketArea = 140;
        final int smallBucketArea = 30;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Length?");
        double l = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Width?");
        double w = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Height?");
        double h = scanner.nextDouble();
        scanner.nextLine();

        double area = 2 * (h * w + h * l) + w * l;
        int ceilAr = (int)Math.ceil(area);

        int bigBucketCount = ceilAr / bigBucketArea;
        int smallBucketCount = (int)Math.ceil((double)(ceilAr - bigBucketCount * bigBucketArea)/smallBucketArea);
        if (smallBucketCount > 3){
            bigBucketCount++;
            smallBucketCount = 0;
        }

        System.out.printf("You need %d big buckets", bigBucketCount);
        if (smallBucketCount > 0){
            System.out.printf(" and %d small buckets", smallBucketCount);
        }
    }
}
