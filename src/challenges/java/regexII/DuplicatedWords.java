package challenges.java.regexII;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicatedWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+"; // This regex captures a word and then checks for its repetition
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // This makes our pattern case-insensitive

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1)); // Replacing the entire match with just the first occurrence
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
