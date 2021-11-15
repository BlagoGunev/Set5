package set13;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();

        String output = isAnagram(s1, s2) ? "Are anagrams" : "Are not anagrams";
        System.out.println(output);

    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a1 = s1.toCharArray(); Arrays.sort(a1);
        char[] a2 = s2.toCharArray(); Arrays.sort(a2);

        for (int i = 0; i < s1.length(); i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }

}
