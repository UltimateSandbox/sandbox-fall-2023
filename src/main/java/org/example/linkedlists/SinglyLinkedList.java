package org.example.linkedlists;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {

        Node newNode = new Node(element, head); // 1 & 2

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            head = newNode;
        }

    }

    @Override
    public void addLast(E element) {

    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean size() {
        return false;
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
