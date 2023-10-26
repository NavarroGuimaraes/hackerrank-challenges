package challenges.java.stringReverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(isWordAPalindrome(word) ? "Yes" : "No");


        scanner.close();
    }

    private static boolean isWordAPalindrome(String str) {
        String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Removes every character which is noy alphanumeric, so this way it can also determine if a phrase is a palindrome.
        String reversed = new StringBuilder(cleanedString).reverse().toString();

        return cleanedString.equals(reversed);
    }
}
