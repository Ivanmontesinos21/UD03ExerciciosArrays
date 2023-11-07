package UD03EjerciciosArrays;

public class Exercise8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fill(array);

        System.out.println(contarpos(array));
        System.out.println(contarneg(array));
        System.out.println(averagePos(array));
        System.out.println(averageNeg(array));


    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = tool.getInteger("Introduce the numbers in the position : " + (i + 1));

    }

    public static int contarpos(int[]array){
        int contarpos=0;
        for (int i=0;i<array.length;i++)
            if (array[i]>=0)
                contarpos++;
        return contarpos;

    }
    public static int contarneg(int[]array){

        int contarneg=0;
        for (int i=0;i<array.length;i++)
            if (array[i]<0)
                contarneg++;
        return contarneg;

    }
    public static double averagePos(int[]array){
        double averagePos=(double)contarpos(array)/array.length;
        return averagePos;
         }

    public static double averageNeg(int[]array){
        double averageNeg=(double)contarneg(array)/array.length;
        return averageNeg;
    }
}







    /*
    Create a program for filling an array with 10 integers entered by user by keyboard.
    Then calculate and show the average of the positive values and the negative
     values of the array.
     */

