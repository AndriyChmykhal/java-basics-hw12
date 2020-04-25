import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(i -> i % 2 != 0)
                .sorted()
                .toArray();
    }
}


/*getSumSquareEven
It should accept int array, filter only even numbers,
and return sum of its square values.
Please use Stream API for this task. Avoid any loops.

getSortedOddsArray
It should accept int array, filter only odd numbers,
and return as int array sorted in ascending order.
Please use Stream API for this task.
Avoid any loops. All test should pass.*/