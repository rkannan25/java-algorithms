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
