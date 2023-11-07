package UD03EjerciciosArrays;




public class Exercise6 {
    public static void main(String[] args) {

        System.out.print("Enter the numeric part of your DNI: ");
        int dni = tool.getInteger("Introduce all the numeric numbers of the DNI:");

        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int rest = dni % 23;
        char calculatedLetter = letters[rest];

        System.out.println("The letter of your DNI is: " + calculatedLetter);
    }

}