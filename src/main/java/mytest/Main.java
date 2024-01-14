package mytest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static Set<String> words = new HashSet<>();
    static SortedSet<String> phrases = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(a -> a));
    //static SortedSet<String> phrases = new TreeSet<>();

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Chandrika Thapa\\Desktop\\MyFile.txt"; // Replace with the actual path to your text file


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String trimmedLine = line.trim();
                if (!trimmedLine.isEmpty()) {
                    String[] wordsInLine = trimmedLine.split("\\s+");
                    if (wordsInLine.length == 1) {
                        words.add(wordsInLine[0]);
                    } else {
                        phrases.add(trimmedLine);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        // Sort phrases by length and then alphabetically
//        Collections.sort(phrases, (a, b) -> {
//            int lengthComparison = Integer.compare(a.length(), b.length());
//            return lengthComparison != 0 ? lengthComparison : a.compareTo(b);
//        });

        // Sort phrases by length and then alphabetically
        //Collections.sort(phrases, Comparator.comparingInt(String::length).thenComparing(a -> a));

        // Print the words collection
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Print the phrases collection
        System.out.println("Phrases:");
        for (String phrase : phrases) {
            System.out.println(phrase);
        }
    }
}






