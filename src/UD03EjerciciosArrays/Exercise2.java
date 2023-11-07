package UD03EjerciciosArrays;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array;
        int size=tool.getInteger("Introduce the value of the array:");
        array=new int[size];
        fill(array,0,9);
        display(array);
        int sum=sum(array);
        System.out.println("Sum of all values: " + sum);
    }
    public static void fill(int[]array,int lowerLimit,int upperLimit){
        for (int i=0;i<array.length;i++){
            array[i]=generateRandom(lowerLimit,upperLimit);
        }
    }


    public static int generateRandom(int lowerLimit,int upperLimit){
        int random=(int) (Math.random()*10);


        return random;
    }
    public static void  display(int[]array){
        for (int i=0;i<array.length;i++)
            System.out.println("the number  " +array[i]  + " in the position:  " + i );
    }
    public static int sum(int[]array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;

    }
}


    /*
    Create an array of numbers where the size of the array will be determined by the user (keyboard),
    then fill the array with random numbers between 0 and 9,
     and at the end show in the screen the value of each position and the sum of all values. Make four methods:

    A method to fill the array (having as parameters the range - lower and upper limit - of the random numbers generated).
    A method to show the content.
    A method to sum the array.
    A method to generate random number (you can use it for other exercises).

     */


