package UD03EjerciciosArrays;

import java.util.Scanner;

public class tool {
    public static void main(String[] args) {


    }
    public static int getInteger(String msg) {
        Scanner sc=new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }
    public static float getfloat(String msg) {
        Scanner sc=new Scanner(System.in);
        System.out.println(msg);
        return sc.nextFloat();
    }
    public static double getDouble(String msg){
        Scanner sc=new Scanner(System.in);
        System.out.print(msg);
        return sc.nextDouble();

    }
}
