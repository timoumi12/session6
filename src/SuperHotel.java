/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class SuperHotel {
    static int x[]; // Uninitialized array

    public void reserver() {
        try {
            x[0] = 1; // Attempting to set value in an uninitialized array
        } catch (NullPointerException e) {
            System.out.println("Array not initialized. Please initialize before setting values.");
        }
    }

    public static void main(String[] args) {
        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}


