// Jessica Kamienski

import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        // Store the sentence in a String variable
        System.out.println("Enter a full sentence: ");
        String message = input.nextLine();
        // Print the number of characters in the sentence
        System.out.println("The length of " + message + " is " + message.length() + " characters.");
        // Print the first and last characters
        System.out.println("The first character in your sentence is " + message.charAt(0));
        System.out.println("The last character in your sentence is " + message.charAt(message.length()-1));

        // Print the sentence with whitespace removed from both ends
        System.out.println("A version of the sentence with all leading and trailing spaces removed would be... " + message.trim());
        // Print the sentence in all uppercase
        System.out.println("A version of the sentence where all letters are changed to uppercase would look like this: " + message.toUpperCase());
        // Print the sentence in all lowercase
        System.out.println("A version of the sentence where all letters are changed to lowercase would look like this: " + message.toLowerCase());
        System.out.println();
        System.out.println();

        // Prompt the user to enter a single character
        System.out.println("Enter a single character: ");
        String character = input.nextLine();
        char ch = character.charAt(0);
        // Determine if it is a letter, digit, or neither
        if (Character.isLetter(ch)) {
            System.out.println("The character you entered is a letter");
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The character is a digit");
        }
        else {
            System.out.println("The character is neither a letter or digit");
        }
        // If it's a letter, check if it's uppercase or lowercase
        if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
            System.out.println("The character you entered is lower case");
        }
        else {
            System.out.println("The character you entered is upper case");
        }
        // Print the decimal code of the character
        int num = ch;
        System.out.println("The decimal code for this character is... " + num);
        // BONUS:
        // Prompt the user for a substring to search for
        // Display the index of the first occurrence or -1 if not found
    }
}
