package week26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class VowelCounter {

    public static void main(String[] args) throws FileNotFoundException {

        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String allConsonants = "qwrtypsdfghjklzxcvbnm";
        Set<Character> consonants = allConsonants.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(HashSet::new));
        int vowelCount = 0;
        int consonantCount = 0;

        File inputFile = new File("src/week26/TestFile.txt");

        if (!inputFile.exists()) {
            System.out.println("No input file found.");
            return;
        }

        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNext()) {
            String nextInput = scanner.next();
            for (char c : nextInput.toCharArray()) {
                if (vowels.contains(c)) {
                    vowelCount++;
                }
                if (consonants.contains(c)) {
                    consonantCount++;
                }
            }
        }
        scanner.close();

        System.out.printf("Vowels: %d; Consonants: %d", vowelCount, consonantCount);

    }

}
