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
                if (numberAnalyzed >= Byte.MIN_VALUE && numberAnalyzed <= Byte.MAX_VALUE) {
                    message.append("\n* byte");
                    message.append("\n* short");
                    message.append("\n* int");
                    message.append("\n* long");
                    continue;
                }
                if (numberAnalyzed >= Short.MIN_VALUE && numberAnalyzed <= Short.MAX_VALUE) {
                    message.append("\n* short");
                    message.append("\n* int");
                    message.append("\n* long");
                    continue;
                }
                if (numberAnalyzed >= Integer.MIN_VALUE && numberAnalyzed <= Integer.MAX_VALUE) {
                    message.append("\n* int");
                    message.append("\n* long");
                    continue;
                }

                message.append("\n* long"); // the scanner reads an input of type LONG. If it's bigger than long, it will throw an exception
                // therefore there's no need to check if it's in the range of long.

            } catch (Exception e) {
                message.append(scanner.next()).append(" can't be fitted anywhere.");
            }

        }

        System.out.println(message.toString());
        scanner.close();

    }
}




