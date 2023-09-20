package org.example.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {

        // try-catch block
        try {
            // do something
        } catch (Exception e) {
            // do something if exception is thrown
            e.printStackTrace();
        }
        // do other stuff

        // try-catch-catch block
        try {
            // do something
        } catch (NullPointerException e) {
            // do something if NullPointerException is thrown
        } catch (Exception e) {
            // do something if exception is thrown
            e.printStackTrace();
        }
        // do other stuff

        try {
            // do something
        } catch (Exception e) {
            // do something if exception is thrown
        } finally {

            try {
                // do something
            } catch (Exception e) {
                // do something if exception is thrown
                e.printStackTrace();
            }

        }

        // java 7 multi-try-catch
        try {

        } catch (ArithmeticException | NullPointerException e) {

        }

        // try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)) {
            // do something
        }

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }

        try(Scanner scanner1 = new Scanner(System.in)) {
            // do something
        } catch (NullPointerException e) {

        }

    }


}
