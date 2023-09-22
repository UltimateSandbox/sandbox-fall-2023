package org.example.generics;

public class Message {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(message);
        return sb.toString();
    }
}
