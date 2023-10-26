package challenges.java.regex;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String ip = scanner.nextLine();
            System.out.println(ip.matches(MyRegex.PATTERN));
        }


    }

    private static class MyRegex {

        // Each octet can be:
        // 0-9, 10-99, 100-199, 200-249, 250-255
        private static final String OCTET = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

        // The pattern is essentially four repetitions of the octet pattern, separated by periods.
        public static final String PATTERN = "^" + OCTET + "\\." + OCTET + "\\." + OCTET + "\\." + OCTET + "$";


    }

}


