package set6.loops;

public class Problem2 {

    public static void main(String[] args) {

        final int lines = 7;
        String spacing = "";

        for (int i = 0; i < lines; i++) {
            System.out.print(spacing);
            for (int j = 0; j < lines - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spacing += " ";
        }
    }

}
