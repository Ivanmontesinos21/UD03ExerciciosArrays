package UD03EjerciciosArrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array = new int[5];
        rellenar(array);

        System.out.println(contarpos(array));
        System.out.println(contarneg(array));
        System.out.println(mediapos(array));
        System.out.println(medianeg(array));


    }

    public static void rellenar(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = tool.obtenerNumero("Introduce los numeros " + (i+1));
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
    public static int mediapos(int[]array){
        int mediapos=0;
        for (int i=0;i<array.length;i++)
            if (array[i]>=0)
                mediapos++;
        return mediapos;
    }
    public static int medianeg(int[]array){
        int medianeg=0;
        for (int i=0;i<array.length;i++)
            if (array[i]<0)
                medianeg++;
        return medianeg;
    }
}







    /*
    Create a program for filling an array with 10 integers entered by user by keyboard.
    Then calculate and show the average of the positive values and the negative
     values of the array.
     */

