package UD03EjerciciosArrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int []array=new int[10];
        rellenar(array);
        mostrar(array);



    }
    public static void rellenar(int[]array){
        for (int i=0;i<array.length;i++)
            array[i]=tool.obtenerNumero("Introduce los numeros");
    }
    public static void mostrar(int[]array) {
        for (int i=0;i<array.length;i++)
            if (array[i]>0)
                array[i]=positive(array);
        else
            array[i]=negative(array);
    }
    public static int positive(int[]array){
      int  contadorpositivo=0;
      int mediaPositivo=contadorpositivo/array.length;
        for (int i=0;i<array.length;i++) {
            if (array[i] <= 0) {
                array[i] += contadorpositivo;
            }
        }
        return mediaPositivo;
    }
    public static int negative(int[]array){
        int  contadornegqtivo=0;
        int mediaNegativo=contadornegqtivo/array.length;
        for (int i=0;i<array.length;i++) {
            if (array[i]<0) {
                array[i] += contadornegqtivo;
            }
        }
        return mediaNegativo;
    }


    }


    /*
    Create a program for filling an array with 10 integers entered by user by keyboard.
    Then calculate and show the average of the positive values and the negative
     values of the array.
     */

