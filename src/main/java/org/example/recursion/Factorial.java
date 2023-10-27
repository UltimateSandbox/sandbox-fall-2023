package org.example.recursion;

public class Factorial {

    private static int counter = 0;

    /*
    define factorial(n):
    f := 1
    for i := 1, 2, 3, ..., n:
      f := f * i
    return f
     */
    public static int factorialIterative(int n) {
        int f = 1;
        // O(n)
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    /*
    define factorial(n):
    if (n = 0)
        return 1
    return n * factorial(n − 1)
     */
    public static int factorialRecursive(int n) {
        System.out.println(++counter);
        // base case
        /*if (n == 0) {
            return 1;
        }*/
        // recursive call O(n)
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            //System.out.println(Factorial.factorialIterative(x));
            System.out.println(Factorial.factorialRecursive(x));
        }
    }

}
