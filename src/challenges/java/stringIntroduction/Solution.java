package challenges.java.stringIntroduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();

        System.out.println((inputA+inputB).length());
        System.out.println(isAGreaterAlphabeticallyThanB(inputA, inputB) ? "Yes" : "No");
        System.out.println((capitalize(inputA)+" "+capitalize(inputB)));

        scanner.close();

    }

    private static boolean isAGreaterAlphabeticallyThanB(String a, String b) {
        return a.compareTo(b) > 0;
    }

    private static String capitalize(String string) {
        if (string == null || string.length() == 0) return string;
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

}
