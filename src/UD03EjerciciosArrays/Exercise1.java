package UD03EjerciciosArrays;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int []array=new int[3];
        fill(array);
        display(array);

    }
    public static void fill (int[] array){
        for (int i=0;i<array.length;i++){
            array[i]=obtenervalores("Introduce el valor "   + (i+1));
        }
    }
    public static void  display(int[]array){
        for (int i=0;i<array.length;i++)
            System.out.println("El numero " +array[i]  + " esta en la posicion: " + i );
    }

    public static int obtenervalores(String msg) {
        Scanner sc=new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }
}