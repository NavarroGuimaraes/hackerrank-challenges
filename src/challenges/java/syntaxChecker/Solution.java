package challenges.java.syntaxChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIterations = scanner.nextInt();
        List<String> patterns = new ArrayList<>();

        scanner.nextLine();
        for (int i = 0; i < numberOfIterations; i++) {
            String inputPattern = scanner.nextLine();
            patterns.add(inputPattern);
        }

        for (String userPattern : patterns) {
            try {
                Pattern pattern = Pattern.compile(userPattern);
                System.out.println("Valid");
            } catch (Exception exception) {
                System.out.println("Invalid");
            }
        }
    }

}
