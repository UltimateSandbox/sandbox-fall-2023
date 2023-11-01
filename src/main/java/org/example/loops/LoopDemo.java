package org.example.loops;

import java.util.ArrayList;
import java.util.List;

public class LoopDemo {

    public static void main(String[] args) {
        int x = 0;
        for (; x <= 10; ) {
            System.out.println(x);
            x++;
        }

        x = 0;
        while (x <=10) {
            System.out.println(x);
            x++;
        }

        x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

        List<String> values = new ArrayList<>();
        for (String value : values) {
            System.out.println(value);
        }

        values.forEach(System.out::println);

    }
}
