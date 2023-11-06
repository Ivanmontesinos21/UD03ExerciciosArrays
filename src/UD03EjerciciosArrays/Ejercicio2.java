package UD03EjerciciosArrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int array[];
        int size=tool.obtenerNumero("Introduce el tamaño");
        array=new int[size];
        int lower=tool.obtenerNumero("Introduce el minimo");
        int upper=tool.obtenerNumero("Introduce el maximo");
       rellenar(size,array,lower,upper);
       mostrar(array,suma(array));
        System.out.println(Math.random()*10);
    }
    public static void rellenar(int size,int[]array,int lower,int upper){
        for (int i=0;i<size;i++)
            array[i]=random(size,lower,upper);
    }
    public static int random(int num,int lower,int upper){
        num= (int) (Math.random() * 10);
        if (lower<0) {
            System.out.println("Introduce un numero mayor a 0");
        }else if (upper>9)
            System.out.println("Introudce un numero menor o igual a 9");
       return num;
    }
    public static int suma(int[] array){
        int suma=0;
        for (int i=0;i<array.length;i++) {
           suma+=array[i];
        }
        return suma;

    }
    public static void mostrar(int[]array,int suma){
        for (int i=0;i<array.length;i++) {
            System.out.println("El valor es: "  + array[i]  + " y se encuentra en la posicion :" + i );
        }
        System.out.print("La suma de todos los valores es " +suma);

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

}
