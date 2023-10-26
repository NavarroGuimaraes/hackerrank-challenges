package challenges.java.substringComparsion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int substringLength = scanner.nextInt();
        List<String> wordBlockList = getWordBlocksOfLength(substringLength, word);
        printSmallestAndBiggestInLexicographicalOrderBlocks(wordBlockList);

        scanner.close();

    }

    private static List<String> getWordBlocksOfLength(int length, String word) {

        List<String> wordBlockList = new ArrayList<>();

        for (int i = 0; i <= word.length()-length; i++) {
            String wordBlock = word.substring(i, i+length);
            wordBlockList.add(wordBlock);
        }

        return wordBlockList;

    }

    private static void printSmallestAndBiggestInLexicographicalOrderBlocks(List<String> wordBlockList) {
        String smallestFound = wordBlockList.get(0);
        String biggestFound = wordBlockList.get(0);

        for (int i = 1; i < wordBlockList.size(); i++) {

            String wordBlock = wordBlockList.get(i);

            if (wordBlock.compareTo(smallestFound) < 0) {
                smallestFound = wordBlock;
                continue;
            }

            if (wordBlock.compareTo(biggestFound) > 0) {
                biggestFound = wordBlock;
            }

        }

        System.out.println(smallestFound);
        System.out.println(biggestFound);
    }

}
