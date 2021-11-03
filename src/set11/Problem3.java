package set11;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int PROBLEM_COUNT = 10;
        char[] answers = new char[PROBLEM_COUNT];
        for (int i = 0; i < PROBLEM_COUNT; i++) {
            answers[i] = scanner.next().charAt(0);
        }

        final int STUDENT_COUNT = 8;
        for (int i = 0; i < STUDENT_COUNT; i++) {
            int result = 0;
            for (int pr = 0; pr < PROBLEM_COUNT; pr++) {
                char ans = scanner.next().charAt(0);
                result += ans == answers[pr] ? 1 : 0;
            }
            System.out.printf("Student %d has scored %d", i, result);
            System.out.println();
        }
    }


}
