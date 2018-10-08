/*
 * Copyright (c) 2018 GE Healthcare
 * All Rights Reserved.
 * No portions of this source code or the resulting compiled program
 * may be used without written permission of GE Healthcare, Inc
 * or beyond the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.test.learning.recursive;

/**
 * Recursive algorithms have two types of cases, recursive cases and base cases.
 * • Every recursive function case must terminate at a base case.
 * • Generally, iterative solutions are more efficient than recursive solutions [due to the
 * overhead of function calls].
 * • A recursive algorithm can be implemented without recursive function calls using a
 * stack, but it’s usually more trouble than its worth. That means any problem that can
 * be solved recursively can also be solved iteratively.
 * • For some problems, there are no obvious iterative algorithms.
 * • Some problems are best suited for recursive solutions while others are not.
 */

public class Factorial {
    public static int find(int number) {
        if (number == 0) return 1;

        return number * find (number - 1);
    }
}
