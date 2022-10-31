/*
 * The program is the
 * "Mr Coxall Stack"
 *
 * By:      Sydney Kuhn
 * Version: 1.0
 * Since:   2020-10-26
 */

import java.util.Scanner;

/**
 * This is the main function.
 */
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Set up scanner
        final Scanner userInt = new Scanner(System.in);
        final SydneyStack stackNum = new SydneyStack();

        // Input
        System.out.print("Enter a Number: ");

        // Process
        try {
            final int userInput = userInt.nextInt();
            stackNum.push(userInput);
            stackNum.finishedStack();
        } catch (java.util.InputMismatchException error) {
            System.out.println("[ NaN ]");
        }

        // Output
        System.out.println("\nDone.");
    }
}
