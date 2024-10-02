import java.math.BigInteger;
import java.util.Scanner;
/**
 * Author: Aubrie McIntyre
 * Date: 10/2/2024
 * Description: User will enter two rational numbers and the program will compare results of different operations.
 */
public class Number {
    public static void main(String[] args) {
        // Initiliaze variables to store numerator and denominator as strings.
        String n = "", d = "", str;

        // Create a scanner object to read user input.
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the first rational number.
        System.out.print("Enter the first Rational Number: ");
        // Read the input as a whole line.
        str = in.nextLine();
        int i;

        //Parse the input string to extract the numerator and denominator.
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') break;
            n += str.charAt(i);
        }
        for (i++; i < str.length(); i++) {
            d += str.charAt(i);
        }

        // Create BigInteger objects to represent the numerator and denominator.
        BigInteger num1 = new BigInteger(n);
        BigInteger deno1 = new BigInteger(d);

        // Prompt the user to enter the second rational number.
        System.out.print("Enter the second Rational Number : ");
        str = in.nextLine();
        n = "";
        d = "";
        // Parse the input string to extract the numerator and denominator.
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') break;
            n += str.charAt(i);
        }
        for (i++; i < str.length(); i++) {
            d += str.charAt(i);
        }

        // Create BigInteger objects to represent the numerator and denominator of the second number.
        BigInteger num2 = new BigInteger(n);
        BigInteger deno2 = new BigInteger(d);
        
        // Perform addition and display the result.
        System.out.println(num1 + "/" + deno1 + " + " + num2 + "/" + deno2 + " = " + (num1.multiply(deno2).add(num2.multiply(deno1))) + 
        "/" + (deno1.multiply(deno2)));

        // Perform subtraction and display the result.
        System.out.println(num1 + "/" + deno1 + " - " + num2 + "/" + deno2 + " = " + (num1.multiply(deno2).subtract(num2.multiply(deno1)))
         + "/" + (deno1.multiply(deno2)));

        // Perform multiplication and display the result.
        System.out.println(num1 + "/" + deno1 + " * " + num2 + "/" + deno2 + " = " + num1.multiply(num2) + "/" + deno1.multiply(deno2));

        // Perform division and display the result.
        System.out.println(num1 + "/" + deno1 + " / " + num2 + "/" + deno2 + " = " + num1.multiply(deno2) + "/" + deno1.multiply(num2));

        // Calculate and display the approzimate decimal value of the second rational number.
         System.out.println(num2 + "/" +deno2 + " is " + num2.doubleValue() / deno2.doubleValue());

        // Close the scanner.
        in.close();
    }
}