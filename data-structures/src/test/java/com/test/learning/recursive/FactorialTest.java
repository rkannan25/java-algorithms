/*
 * Copyright (c) 2018 GE Healthcare
 * All Rights Reserved.
 * No portions of this source code or the resulting compiled program
 * may be used without written permission of GE Healthcare, Inc
 * or beyond the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.test.learning.recursive;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFind() {
        Assert.assertEquals(1, Factorial.find(0));
        Assert.assertEquals(1, Factorial.find(1));
        Assert.assertEquals(2, Factorial.find(2));
        Assert.assertEquals(6, Factorial.find(3));
        Assert.assertEquals(24, Factorial.find(4));
    }
}
