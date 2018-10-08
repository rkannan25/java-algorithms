/*
 * Copyright (c) 2018 GE Healthcare
 * All Rights Reserved.
 * No portions of this source code or the resulting compiled program
 * may be used without written permission of GE Healthcare, Inc
 * or beyond the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.test.learning.recursive;

public class Factorial {
    public static int find(int number) {
        if (number == 0) return 1;

        return number * find (number - 1);
    }
}
