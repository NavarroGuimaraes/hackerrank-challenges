package challenges.java.anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        System.out.println(isAnagram(firstString, secondString) ? "Anagrams" : "Not Anagrams");

    }

    private static boolean isAnagram(String firstString, String secondString) {

        firstString = firstString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        secondString = secondString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (firstString.length() != secondString.length()) {
            return false;
        }

        Map<Character, Integer> firstStringMapped = getCharacterCounter(firstString);
        Map<Character, Integer> secondStringMapped = getCharacterCounter(secondString);

        return firstStringMapped.equals(secondStringMapped);

    }

    private static Map<Character, Integer> getCharacterCounter(String str) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCounter.put(c, charCounter.getOrDefault(c, 0)+1);
        }
        return charCounter;
    }
}
