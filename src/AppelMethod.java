/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */


public class AppelMethod {
    public void method1() {
        try {
            this.method2(); // Calls method2, causing infinite recursion
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow detected due to infinite recursion. Check method calls.");
        }
    }

    public void method2() {
        this.method1(); // Calls method1, causing infinite recursion
    }

    public static void main(String[] args) {
        AppelMethod appel = new AppelMethod();
        appel.method1();
    }
}
