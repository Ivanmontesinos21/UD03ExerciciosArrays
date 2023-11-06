package UD03EjerciciosArrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[]array=new int[100];
        rellenar(array);
        mostrar(array);

    //    System.out.println("La suma de los numeros es : " + suma(array));
        System.out.println("La media de los numeros es: " + media(array));

    }
    public static void rellenar(int[]array){
        for (int i=0;i<array.length;i++)
            array[i]=i+1;
    }
    /*public static int suma(int[] array) {
        int valor = 0;
     //  for (int sum:array)
    }
    */

    public static int media(int[]array){
        int media=0;
        for (int i=0;i<array.length;i++) {
            array[i] = media;

        }
        return media/array.length;
    }
    public static void mostrar(int[]array){
        for (int n:array)
            System.out.println(n + "");
    }
}
