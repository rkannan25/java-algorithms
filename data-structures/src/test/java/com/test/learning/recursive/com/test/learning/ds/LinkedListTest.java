package com.test.learning.recursive.com.test.learning.ds;

import com.test.learning.ds.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testInsertAtHead() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(4);
        Assert.assertEquals(4, linkedList.getLength());
        linkedList.display();

        linkedList.insertAtHead(5);
        Assert.assertEquals(5, linkedList.getLength());
        linkedList.display();
    }

    @Test
    public void testInsertAtTail() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtTail(1);
        linkedList.insertAtTail(2);
        linkedList.insertAtTail(3);
        linkedList.insertAtTail(4);
        Assert.assertEquals(4, linkedList.getLength());
        linkedList.display();

        linkedList.insertAtTail(5);
        Assert.assertEquals(5, linkedList.getLength());
        linkedList.display();
    }

    @Test
    public void testInsert() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        Assert.assertEquals(4, linkedList.getLength());
        linkedList.display();

        linkedList.insert(5);
        Assert.assertEquals(5, linkedList.getLength());
        linkedList.display();
    }

    @Test
    public void testInsertAtPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtPosition(1, 4);
        Assert.assertEquals(0, linkedList.getLength());

        linkedList.insertAtPosition(1, 0);
        Assert.assertEquals(1, linkedList.getLength());

        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        Assert.assertEquals(4, linkedList.getLength());
        linkedList.display();

        linkedList.insertAtPosition(5, 2);
        Assert.assertEquals(5, linkedList.getLength());
        linkedList.display();

        linkedList.insertAtPosition(6, 5);
        Assert.assertEquals(6, linkedList.getLength());
        linkedList.display();

        linkedList.insertAtPosition(7, 7);
        Assert.assertEquals(6, linkedList.getLength());
        linkedList.display();
    }
}
