package UD03EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] array=new int[10];
        rellenar(array);
        mostrar(array);





    }
    public static int obtenerNumero(String msg){
        Scanner sc=new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();

    }
    public static void rellenar(int[]array){
        for (int i=0;i<array.length;i++)
            array[i]=obtenerNumero("Introduce la cantidad de numero " + (i+1)+ "");
    }
    public static void  mostrar(int[] array){
        for (int i=0;i<array.length;i++)
            System.out.println("Se encuentra en la posicion "+ i + " y sus valor es " + array[i]);

    }
}