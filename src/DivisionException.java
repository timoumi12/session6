
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class DivisionException {
    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        y = scanner.nextInt();

        try {
            System.out.println("Result: " + (x / y)); // Original division
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please enter a non-zero integer.");
        }
    }
}
