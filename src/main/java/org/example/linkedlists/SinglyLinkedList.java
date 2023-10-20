package org.example.linkedlists;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;
    private int count;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    public void addFirst(E element) {

        Node newNode = new Node(element, head); // 1 & 2

        if (head == null) { // corner case
            head = newNode;
            tail = head;
        } else {
            head = newNode; // 3
        }
        count++;
    }

    @Override
    public void addLast(E element) {

        Node newNode = new Node(element, null);  // 1

        if (tail == null) {  // corner case
            tail = newNode;
            head = tail;
        } else {
            tail.next = newNode; // 2
            tail = newNode; // 3
        }
        count++;
    }

    @Override
    public E pollFirst() {

        E element; // 1
        if (head == null) {
            element = null; // 1
        } else {
            element = head.element; // 1

            Node next = head.next; // 2
            head.next = null; // 3
            head = next; // 4
        }
        count--;
        return element;
    }

    @Override
    public E pollLast() {

        E element; // 1
        if (tail == null) {
            element = null;
        } else {

            element = tail.element; // 1

            if (head == tail) {
                // if list is one element
                head = null;
                tail = null;
            } else {

                // if list is more than one element...
                Node current = head; // 2
                Node previous = head; // 2
                while(current.next != null){ // 2
                    previous = current;
                    current = current.next;
                }
                tail = previous; // 3
                tail.next = null; // 4
            }
        }
        count--;
        return element;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while( current != null) {
            joiner.add(current.element.toString());
            current = current.next;
        }

        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {

        Node next;
        E element;

        public Node(E element, Node next) {
            this.next = next;
            this.element = element;
        }
    }
}
