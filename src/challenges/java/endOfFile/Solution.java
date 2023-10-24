package challenges.java.endOfFile;

import java.util.Scanner;

public class Solution {

    private static final String EMPTY_SPACE = " ";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lineCounter = 1;
        StringBuilder finalFile = new StringBuilder();

        while (scanner.hasNextLine()) {

            String userInput = scanner.nextLine();

            if (!finalFile.isEmpty()) {
                finalFile.append(System.lineSeparator());
            }

            if (userInput.isEmpty()) {
                break;
            }

            finalFile.append(lineCounter).append(EMPTY_SPACE).append(userInput);
            lineCounter++;

        }

        System.out.println(finalFile.toString());
        scanner.close();

    }
}

