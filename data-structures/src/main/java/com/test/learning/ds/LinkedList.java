package com.test.learning.ds;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void insertAtHead(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.tail = node;
        } else {
            node.setNext(this.head);
        }
        this.head = node;
        this.length++;
    }

    public void insertAtTail(int data) {
        this.insert(data);
    }

    public void insertAtPosition(int data, int position) {
        if (position > this.length) {
            System.out.println("invalid position provided, it is greater than length of the list");
            return;
        }

        if (position == 0) {
            this.insertAtHead(data);
        } else if (position == this.length) {
            this.insertAtTail(data);
        } else {
            Node prev = null;
            Node curr = this.head;
            int currPosition = 0;
            while (currPosition < position) {
                prev = curr;
                curr = curr.getNext();
                currPosition++;
            }
            Node node = new Node(data);
            prev.setNext(node);
            node.setNext(curr);
            this.length++;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (this.tail == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
        }
        this.tail = node;
        this.length++;
    }

    public int getLength() {
        return this.length;
    }

    public void display() {
        Node first = this.head;
        System.out.println();
        while (first != null) {
            System.out.print(first.getData() + " -> ");
            first = first.getNext();
        }
        System.out.print("null\n");
    }
}
