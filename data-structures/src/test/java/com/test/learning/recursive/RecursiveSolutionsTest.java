package com.test.learning.recursive;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveSolutionsTest {
    @Test
    public void testArraySorted() {
        int [] a = new int[] { 1, 1, 2, 3, 4 };
        int [] b = new int[] { 2, 1, 2, 3, 4 };
        int [] c = new int[] { 10, 11, 15, 19, 28, 90 };
        int [] d = new int[] { 9 };
        int [] e = new int[] { 9, 11, 8, 10 };

        Assert.assertTrue(RecursiveSolutions.isSortedOrder(a, 0, a.length));
        Assert.assertFalse(RecursiveSolutions.isSortedOrder(b, 0, b.length));
        Assert.assertTrue(RecursiveSolutions.isSortedOrder(c, 0, c.length));
        Assert.assertTrue(RecursiveSolutions.isSortedOrder(d, 0, d.length));
        Assert.assertFalse(RecursiveSolutions.isSortedOrder(e, 0, e.length));
    }
}
