package UD03EjerciciosArrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fill(numbers);
        display(numbers);


    }


    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = tool.getInteger("Introduce the numbers in the position : " + (i + 1));

    }

    public static  int positive(int[]numbers){
        int pos=0;
        for (int number:numbers)
            if (number>0)
                pos++;
        return pos;
    }
    public static  int negative(int[]numbers){
        int neg=0;
        for (int number:numbers)
            if (number<0)
                neg++;
        return neg;
    }
    public static int zero(int[]numbers){
        int zero=0;
        for (int number:numbers)
            if (number==0)
                zero++;
        return zero;
    }

    public static void display(int[] numbers) {
        for (int number : numbers) {
            if (number > 0)
                System.out.println("The quantity of positive numbers are:  " + positive(numbers));
            else if (number < 0) {
                System.out.println("The quantity of negative numbers are: " + negative(numbers));
            } else if (number == 0)
                System.out.println("The quantity of  numbers that  are 0 is:  " + zero(numbers));

        }

    /*
    Create a program with 10 integers entered by the keyboard.
     The program must be able to know how many numbers
      are positive, negative or cero.
     */
    }
}
