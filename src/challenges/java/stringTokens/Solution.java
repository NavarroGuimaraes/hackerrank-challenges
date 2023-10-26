package challenges.java.stringTokens;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine().trim();
        String[] tokens = tokenize(sentence);

        printValidTokens(tokens);
        printEachToken(tokens);

    }

    private static String[] tokenize(String sentence) {
        // This regex is responsible for splitting whenever something different than a letter appears
        return sentence.split("[^a-zA-Z]+");
    }

    private static void printValidTokens(String[] tokens) {
        // Count valid tokens (non-empty)
        int validTokenCount = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                validTokenCount++;
            }
        }
        System.out.println(validTokenCount);
    }
    private static void printEachToken(String[] tokens)  {
        for (String token: tokens) {
            System.out.println(token);
        }
    }


}
