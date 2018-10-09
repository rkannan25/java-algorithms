package com.test.learning.recursive;

/**
 * Move the top n – 1 disks from Source to Auxiliary tower,
 * • Move the nth disk from Source to Destination tower,
 * • Move the n – 1 disks from Auxiliary tower to Destination tower.
 * • Transferring the top n – 1 disks from Source to Auxiliary tower can again be thought
 *   of as a fresh problem and can be solved in the same manner. Once we solve Towers of Hanoi with three disks,
 *   we can solve it with any number of disks with the above algorithm.
 */
public class TowersOfHanoi {
    public static void move(int n, String source, String destination, String auxiliary) {
        if (n == 0) return;

        if (n == 1) {
            System.out.println("moving disk " + n + " from " + source + " to " + destination);
            return;
        }

        move(n -1, source, auxiliary, destination);
        System.out.println("moving disk " + n+ " from " + source + " to " + destination);
        move(n-1, auxiliary, destination, source);
    }
}
