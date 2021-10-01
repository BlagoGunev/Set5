package set6.loops;

public class Problem1 {

    public static void main(String[] args) {

        int currLineCharCount = 0;
        for (char c = '!'; c <= '~'; c++) {
            currLineCharCount++;
            System.out.printf("%c ", c);

            if (currLineCharCount >= 10) {
                System.out.println();
                currLineCharCount = 0;
            }
        }

    }

}
