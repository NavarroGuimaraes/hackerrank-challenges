package challenges.java.intToString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            String possibleString = String.valueOf(scanner.nextInt());
            System.out.println("Good job");

        } catch (Exception e) {

            System.out.println("Wrong answer");

        }

    }

}
