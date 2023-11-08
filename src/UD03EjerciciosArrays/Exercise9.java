package UD03EjerciciosArrays;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = tool.getInteger("Enter the number of people (N):");

        if (N <= 0) {
            System.out.println("Please enter a positive integer for N.");
            return;
        }

        double[] heights = new double[N];

        // Read the heights of N people
        fill(heights);

        // Calculate the average height
        double averageHeight = calculateAverageHeight(heights);

        System.out.println("Average height: " + averageHeight + " cm");

        // Count people above and below average
        int aboveAverageCount = countPeopleAboveAverage(heights, averageHeight);
        int belowAverageCount = countPeopleBelowAverage(heights, averageHeight);

        System.out.println("People above average height: " + aboveAverageCount);
        System.out.println("People below average height: " + belowAverageCount);
    }
    public static void fill(double[]heights){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter the height of person " + (i + 1) + " (in centimeters): ");
            heights[i] = sc.nextDouble();
        }
    }

    public static double calculateAverageHeight(double[] heights) {
        double sum = 0.0;
        for (double height : heights) {
            sum += height;
        }
        return sum / heights.length;
    }

    public static int countPeopleAboveAverage(double[] heights, double averageHeight) {
        int count = 0;
        for (double height : heights) {
            if (height > averageHeight) {
                count++;
            }
        }
        return count;
    }

    public static int countPeopleBelowAverage(double[] heights, double averageHeight) {
        int count = 0;
        for (double height : heights) {
            if (height < averageHeight) {
                count++;
            }
        }
        return count;
    }
}
