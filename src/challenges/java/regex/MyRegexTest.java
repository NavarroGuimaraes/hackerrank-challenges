package challenges.java.regex;

public class MyRegexTest {
    // Octet breakdown:
    // 0-9 (1 digit)
    // 00-99 (2 digits)
    // 000-255 (3 digits)
    //private static final String OCTET = "(25[0-5]|2[0-4]\\d|1\\d{2}|0{0,2}[0-9]{1,2})";
    private static final String OCTET = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

    // The pattern consists of four repetitions of the octet pattern, separated by periods.
    public static final String PATTERN = "^" + OCTET + "\\." + OCTET + "\\." + OCTET + "\\." + OCTET + "$";

    public static void main(String[] args) {
        // Test
        String[] testCases = {
                "12.12.12.12",
                "13.13.13.112",
                "VUUT.12.12",
                "111.111.11.111",
                "1.1.1.1.1.1.1",
                ".....",
        "1...1..1..1",
        "0.0.0.0",
        "255.0.255.0",
        "266.266.266.266",
        "00000.000000.0000000.00001",
        "0023.0012.0012.0034"
        };

        for (String test : testCases) {
            System.out.println(test + " matches? " + test.matches(PATTERN));
        }
    }
}