package UD03EjerciciosArrays;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of characters containing from the 'A' to the 'Z'
        char[] charArray = new char[26];
        for (int i = 0; i < 26; i++) {
            charArray[i] = (char) (i + 'A');
        }

        String guessedPositions = "";

        while (true) {
            System.out.println("Enter the position of the selected character (-1 to stop): ");
            int position = scanner.nextInt();

            if (position == -1) {
                break;
            }

            if (position >= 0 && position < 26) {
                guessedPositions += position + " ";
            }
        }

        System.out.println("\nThe guessed positions are: " + guessedPositions);
    }
}