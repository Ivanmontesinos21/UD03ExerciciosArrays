package UD03EjerciciosArrays;



public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers=new int[100];
        fill(numbers);
          display(numbers);
        sum(numbers);
        int sum=sum(numbers);
        double average=average(numbers);
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Average of all numbers: " + average);


    }
    public static void  fill(int[]numbers){
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
    }
    //The function display is for check if numbers are between 1 and 100//
   public static void display(int[]numbers){
        for (int number:numbers)
            System.out.println(number);
    }

    public static int sum(int[]numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }



    public static double average(int[]numbers){

        double average=(double) sum(numbers)/numbers.length;
        return  average;
    }
}