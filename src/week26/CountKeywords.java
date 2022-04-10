package week26;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountKeywords {
    public static void main(String[] args) throws Exception {
        File file = new File("src/week26/TestHashSet.java");
        if (file.exists()) {
            System.out.println("The number of keywords is " + countKeywords(file));
        } else {
            System.out.println("File does not exist");
        }

    }

    public static int countKeywords(File file) throws Exception {
        // Array of all Java keywords + true, false and null
        String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
                "true", "false", "null" };
        Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);
        boolean isMultilineComment = false;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            line = line.replaceAll("\\n", "");

            Pattern pattern = Pattern.compile("(/\\*|//\\*).+(\\*/)");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                if (isMultilineComment) {
                    line = line.replaceAll(".+(\\*/)", "");
                }
                line = line.replaceAll("(/\\*|//\\*).+(\\*/)", "");
                isMultilineComment = false;
            }

            pattern = Pattern.compile(".+(\\*/)");
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                line = line.replaceAll(".+(\\*/)", "");
                isMultilineComment = false;
            }
            if (isMultilineComment) {
                continue;
            }

            pattern = Pattern.compile("(/\\*|//\\*).+");
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                line = line.replaceAll("(/\\*|//\\*).+", "");
                isMultilineComment = true;
            }

            pattern = Pattern.compile("//.+");
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                line = line.replaceAll("//.+", "");
            }

            for (String word : line.split("[\\s+\\p{P}]")) {
                if (keywordSet.contains(word)) {
                    count++;
                }
            }
        }
        input.close();
        return count;

    }
}