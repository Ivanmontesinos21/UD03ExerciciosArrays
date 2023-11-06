package UD03EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[]N;
        int alturas=obtenerNumero("Introduce el numero de personas");
        N=new int[alturas];
        rellenar(N);
        mostrar(N);



    }
    public static void rellenar(int[]N){
        for (int i=0;i<N.length;i++)
            N[i]=obteneralturas("Introduce las alturas "  + (i+1));
    }
    public static void  mostrar(int[]N){
        for (int n:N)
            System.out.println(n+"");
    }
    public static int obtenerNumero(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }
    public static int obteneralturas(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        while (!sc.hasNextInt())
            System.out.println("Solo puedes introducir numeros enteros ");
        sc.next();
        return sc.nextInt();
    }
    public static int media(int[] N) {
        int media = 0;
        for (float altura : N)
            media += altura;
        media = media / N.length;

        return media;

    }


    /*
    Create Java program to read the height of N people and calculate the average height.
     Calculate how many people have a height above the average and how many have a height below the average.
     The value of N is requested by keyboard and must be a positive integer.
     */
}
