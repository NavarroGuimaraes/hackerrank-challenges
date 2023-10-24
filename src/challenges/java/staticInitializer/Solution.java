package challenges.java.staticInitializer;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int breadth = scanner.nextInt();
        int height = scanner.nextInt();

        if (breadth <= 0 || height <= 0) {
            //throw new Exception("java.lang.Exception: Breadth and height must be positive");
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return;
        }

        System.out.println(breadth * height);

    }

}
