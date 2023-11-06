package UD03EjerciciosArrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[]numbers=new int[10];



    }
    public static void counter(int[] numbers){
      int  counterpos=0,counterneg=0 ,countercero=0;
        for (int i=0;i<numbers.length;i++) {
            if (i > 0)
                counterpos++;
            else if (i<0)
                counterneg++;
            else
                countercero++;

        }

    }
    public static void rellenar(int[]numbers){
        for (int i=0;i<numbers.length;i++)
            numbers[i]=tool.obtenerNumero("Introduce los numeros");

    }
    /*
    Create a program with 10 integers entered by the keyboard.
     The program must be able to know how many numbers
      are positive, negative or cero.
     */
}
