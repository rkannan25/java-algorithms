package com.test.learning.recursive;

import org.junit.Test;

public class TowersOfHanoiTest {
    @Test
    public void testMove() {
        TowersOfHanoi.move(0, "S", "D", "I");
        System.out.println();
        TowersOfHanoi.move(1, "S", "D", "I");
        System.out.println();
        TowersOfHanoi.move(2, "S", "D", "I");
        System.out.println();
        TowersOfHanoi.move(3, "S", "D", "I");
        System.out.println();
        TowersOfHanoi.move(4, "S", "D", "I");
        System.out.println();
        TowersOfHanoi.move(5, "S", "D", "I");
    }
}
