package week25;

import java.util.Scanner;
import java.util.Stack;

public class KAT {

    public static void main(String[] args) {

        final int SPEED = 80;

        Stack<Integer> speedLimits = new Stack<>();
        speedLimits.push(SPEED);
        int currentPlace = 0;
        Scanner scanner = new Scanner(System.in);
        int length, numberOfSigns;

        double ans = 0;

        length = scanner.nextInt();
        numberOfSigns = scanner.nextInt();

        for (int i = 0; i < numberOfSigns; i++) {
            int place, speed;
            place = scanner.nextInt(); speed = scanner.nextInt();
            ans += (double) (place - currentPlace) / speedLimits.peek();
            currentPlace = place;
            if (speed == -1) {
                speedLimits.pop();
                if (speedLimits.isEmpty()) {
                    speedLimits.push(SPEED);
                }
            } else {
                speedLimits.push(speed);
            }
        }

        ans += (double) (length - currentPlace) / speedLimits.peek();
        System.out.printf("%.2f\n", ans);
    }

}
