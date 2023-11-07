package UD03EjerciciosArrays;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int[] height;
        int[] N;
        fillN(N);
        fillHeight(height);


    }

    public static double averageHeight(int[] height) {
        double average = 0;
        for (int i = 0; i < height.length; i++)
            average += height[i];
        average = average / height.length;
        return average;


    }

    public static void fillN(int[] N) {
        for (int i = 0; i < N.length; i++)
            N[i] = tool.getInteger("Introduce the number of people");
    }


    public static void fillHeight(int[]height){
        for (int i=0;i<height.length;i++)
            height[i]= (int) tool.getfloat("Introduce the height");

    }




    /*
    Create Java program to read the height of N people and calculate the average height.
     Calculate how many people have a height above the average and how many have a height below the average.
     The value of N is requested by keyboard and must be a positive integer.
     */
}
