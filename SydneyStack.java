/*
 * The program is a class.
 *
 * By:      Sydney Kuhn
 * Version: 1.0
 * Since:   2020-10-26
 */

import java.util.ArrayList;

/**
 * This is a class for my program.
 */
public class SydneyStack {

    /**
     * Private array (only accessible within this class).
     */
    private ArrayList<Integer> stackNum = new ArrayList<Integer>();

    /**
     * This is a function for the pushed item.
     *
     * @param userInt the number thats added to the array.
     *
     */
    public void push(final int userInt) {
        stackNum.add(userInt);
    }

    /**
     * Finalizing the stack.
     */
    public void finishedStack() {
        System.out.println(stackNum);
    }
}
