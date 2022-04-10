package week26;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapKeywords {
    public static void main(String[] args) throws Exception {
        File file = new File("src/week26/TestHashSet.java");
        if (file.exists()) {
            Map<String, Integer> keywordsMap = mapKeywords(file);
            for (var mapEntry : keywordsMap.entrySet()) {
                System.out.printf("%s: %d times\n", mapEntry.getKey(), mapEntry.getValue());
            }
        } else {
            System.out.println("File does not exist");
        }

    }

    public static Map<String, Integer> mapKeywords(File file) throws Exception {
        // Array of all Java keywords + true, false and null
        String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
                "true", "false", "null" };
        Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
        Map<String, Integer> keywordsMap = new HashMap<>();
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
                    if (!keywordsMap.containsKey(word)) {
                        keywordsMap.put(word, 0);
                    }
                    keywordsMap.put(word, keywordsMap.get(word)+1);
                }
            }
        }
        input.close();
        return keywordsMap;

    }
}
