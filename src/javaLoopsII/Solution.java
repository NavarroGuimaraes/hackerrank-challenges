package javaLoopsII;

import java.util.Scanner;

public class Solution {

    private static final String EMPTY_SPACE = " ";

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        int numberOfQueries = scanner.nextInt();

        StringBuilder message = new StringBuilder();

        for (int i=0; i < numberOfQueries ;i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            doHackerRankSeries(a, b, n, message);
            message.append("\n");

        }

        //System.out.println(message.toString());// Java 8
        System.out.println(message);

        scanner.close();

    }

    private static void doHackerRankSeries(int a, int b, int n, StringBuilder message) {

        int sum = 0;

        for (int seriesIndex = 0; seriesIndex < n; seriesIndex++) {

            if (shouldCalculateAsFirstIteration(seriesIndex)) {
                message.append(doFirstIteration(a, b));
                continue;
            }

            message.append(EMPTY_SPACE);

            if (shouldCalculateAsSecondIteration(seriesIndex)) {
                sum = doSecondIteration(a, b);
            } else {
                int currentResult = doNIteration(b, seriesIndex);
                sum += currentResult;
            }

            message.append(sum);

        }

    }

    private static int doFirstIteration(int a, int b) {
        return a + b;
    }

    private static int doSecondIteration(int a, int b) {
        return a + b + (2 * b);
    }

    private static int doNIteration(int b, int n) {
        return (int) Math.pow(2, n) * b;
    }

    private static boolean shouldCalculateAsFirstIteration(int index) {
        return index == 0;
    }

    private static boolean shouldCalculateAsSecondIteration(int index) {
        return index == 1;
    }

}
