package org.example;

public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int total = 0;
        int counter = 1;
        do {
            total = total + counter;
            counter = counter + 1;
        }
        while (total % 2 != 0 && counter <= n);
        return total;
    }
}
