package challenges.java.dataTypes;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {

        Scanner scanner = new Scanner(System.in);
        int numberQuantity = scanner.nextInt();
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numberQuantity; i++) {

            if (i > 0) {
                message.append("\n");
            }

            try {
                long numberAnalyzed = scanner.nextLong();
                message.append(numberAnalyzed).append(" can be fitted in:");
                if (numberAnalyzed >= -128 && numberAnalyzed <= 127) System.out.println("\n* byte");
                if (numberAnalyzed >= -128 && numberAnalyzed <= 127) System.out.println("\n* byte");
                //Complete the code
            } catch (Exception e) {
                message.append(scanner.next()).append(" can't be fitted anywhere.");
            }

        }
    }
}




