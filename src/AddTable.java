/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class AddTable {
    public static void main(String[] args) {
        int[] array = new int[3]; // Array with 3 elements

        for (int i = 0; i < 4; ++i) { // Original loop, goes out of bounds
            try {
                array[i] = i; // Attempt to assign value outside array bounds
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds at index: " + i + ". Maximum allowed index is " + (array.length - 1));
            }
        }

        // Print the array contents
        for (int num : array) {
            System.out.println(num);
        }
    }
}
