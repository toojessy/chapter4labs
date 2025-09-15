// Jessica Kamienski

import java.util.Scanner;

public class NumberManipulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any decimal number: ");
        Double num = input.nextDouble();

        // Print the smallest integer greater than or equal to the number
        Double floor = Math.floor(num);
        System.out.print("The smallest integer '>' or '=' to " + num + " is... " + floor);
        System.out.println();
        // Print the largest integer less than or equal to the number
        Double ceil = Math.ceil(num);
        System.out.println("The largest integer '<' or '=' to " + num + " is... " + ceil);
        // Print the integer that is closest to the number (ties go to even)
        Double rint = Math.rint(num);
        System.out.println("The closest integer to the number " + num + " with ties going to the even number... " + rint);
        // Print the integer closest to the number (standard rounding)
        long roundedDouble = Math.round(num);
         System.out.println("The closest integer to the number " + num + " is... " + roundedDouble);
        // BONUS:
        // Cast the number to an int and print the character it represents
        // Add 1 to that number and print the next character
        // Format a summary table using formatted output
    }
}

